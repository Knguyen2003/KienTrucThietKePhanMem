package com.iuh;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;  //package-private


    public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();  // tính tổng tiền
        paymentMethod.pay(amount); // thanh toán
    }
}
