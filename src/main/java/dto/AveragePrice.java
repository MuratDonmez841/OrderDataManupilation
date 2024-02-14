package dto;

public class AveragePrice {
    public int orderNumber;
    public double orderMaterialUnitPrice;

    public AveragePrice() {
    }

    public AveragePrice(int orderNumber, double orderMaterialUnitPrice) {
        this.orderNumber = orderNumber;
        this.orderMaterialUnitPrice = orderMaterialUnitPrice;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getOrderMaterialUnitPrice() {
        return orderMaterialUnitPrice;
    }

    public void setOrderMaterialUnitPrice(double orderMaterialUnitPrice) {
        this.orderMaterialUnitPrice = orderMaterialUnitPrice;
    }

    @Override
    public String toString() {
        return "AveragePrice{" +
                "orderNumber=" + orderNumber +
                ", orderMaterialUnitPrice=" + orderMaterialUnitPrice +
                '}';
    }
}
