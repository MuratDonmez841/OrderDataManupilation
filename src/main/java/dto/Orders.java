package dto;

import java.util.ArrayList;

public class Orders {

    private ArrayList<Order> ordersArrayList;


    public Orders(ArrayList<Order> ordersArrayList) {
        this.ordersArrayList = ordersArrayList;
    }

    public Orders() {
    }

    public ArrayList<Order> getOrdersArrayList() {
        return ordersArrayList;
    }

}
