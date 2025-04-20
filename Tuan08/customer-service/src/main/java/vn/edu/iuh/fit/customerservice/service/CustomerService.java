package vn.edu.iuh.fit.customerservice.service;

import vn.edu.iuh.fit.customerservice.model.Customer;
import java.util.List;


public interface CustomerService {
    public Customer save(Customer customer);
    public List<Customer> findAll();
    public Customer findById(Long id);
    public void delete(Long id);
}
