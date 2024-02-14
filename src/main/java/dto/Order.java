package dto;

public class Order {
    public int orderNumber;
    public int orderMaterialNumber;
    public int orderQty;
    public double orderMaterialUnitPrice;

    public Order() {

    }

    public Order(int orderNumber, int orderMaterialNumber, int orderQty, double orderMaterialUnitPrice) {
        this.orderNumber = orderNumber;
        this.orderMaterialNumber = orderMaterialNumber;
        this.orderQty = orderQty;
        this.orderMaterialUnitPrice = orderMaterialUnitPrice;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderMaterialNumber() {
        return orderMaterialNumber;
    }

    public void setOrderMaterialNumber(int orderMaterialNumber) {
        this.orderMaterialNumber = orderMaterialNumber;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public double getOrderMaterialUnitPrice() {
        return orderMaterialUnitPrice;
    }

    public void setOrderMaterialUnitPrice(double orderMaterialUnitPrice) {
        this.orderMaterialUnitPrice = orderMaterialUnitPrice;
    }
}
