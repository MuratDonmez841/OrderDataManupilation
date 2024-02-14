package dto;

public class OrderMaterialQty {
    private int orderMaterialNumber;
    private int orderNumber;
    private double materialQty;

    public OrderMaterialQty() {
    }

    public OrderMaterialQty(int orderMetarialNumber, int orderNumber, double materialQty) {
        this.orderMaterialNumber = orderMetarialNumber;
        this.orderNumber = orderNumber;
        this.materialQty = materialQty;
    }


    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getMaterialQty() {
        return materialQty;
    }

    public void setMaterialQty(double materialQty) {
        this.materialQty = materialQty;
    }

    public int getOrderMaterialNumber() {
        return orderMaterialNumber;
    }

    public void setOrderMaterialNumber(int orderMaterialNumber) {
        this.orderMaterialNumber = orderMaterialNumber;
    }

    @Override
    public String toString() {
        return "OrderMaterialQty{" +
                "orderNumber=" + orderNumber +
                ", orderMaterialNumber=" + orderMaterialNumber +
                ", materialQty=" + materialQty +
                '}';
    }
}
