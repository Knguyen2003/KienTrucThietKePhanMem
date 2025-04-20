package vn.edu.iuh.fit.customerservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.customerservice.model.Customer;
import vn.edu.iuh.fit.customerservice.service.CustomerService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping
    public List<Customer> getAll() {
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        Map<String, Object> response = new LinkedHashMap<>();
        try {
            Customer c = customerService.findById(id);
            response.put("status", HttpStatus.CREATED.value());
            response.put("message", "Customer find by id succesful!");
            response.put("data", c);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }  catch (Exception ex) {
            // Các lỗi còn lại
            response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Đã xảy ra lỗi không mong muốn.");
            response.put("error", ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }


    @PostMapping("/save")
    public ResponseEntity<Map<String, Object>> save(@RequestBody Customer customer) {
        Map<String, Object> response = new LinkedHashMap<>();
        try {
            Customer c = customerService.save(customer);
            response.put("status", HttpStatus.CREATED.value());
            response.put("message", "Customer created successfully!");
            response.put("data", c);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }  catch (Exception ex) {
            // Các lỗi còn lại
            response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.put("message", "Đã xảy ra lỗi không mong muốn.");
            response.put("error", ex.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}


     
     
     
     
     
     
     