package org.example;

import request.Get;
import request.Post;
import services.OrderOperation;

public class Main {
    public static void main(String[] args) {
        OrderOperation operation = new OrderOperation();
        operation.addOrderList();
        System.out.println("1 a : "+operation.totalAmountOfMaterial());
        System.out.println("1 b : "+ operation.averagePrice());
        System.out.println("1 c : "+ operation.averagePriceForMaterial());
        System.out.println("1 d : "+ operation.orderMaterialQty());
        Get.getRequest();
        Post.postRequest();
    }
}