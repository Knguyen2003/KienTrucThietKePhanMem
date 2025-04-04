package com.iuh;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        //Tạo sản phẩm
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
        //Thêm sản phẩm vào giỏ hàng
        cart.addItem(item1);
        cart.addItem(item2);





        //Thanh toán
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
}
