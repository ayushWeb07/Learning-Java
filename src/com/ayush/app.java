package com.ayush;

import com.ayush.controllers.OrdersController;
import com.ayush.controllers.ProductsController;
import com.ayush.controllers.UsersController;

public class app {
    public static void main(String[] args) {
        ProductsController p= new ProductsController();
        UsersController u= new UsersController();
        OrdersController o= new OrdersController();
    }
}
