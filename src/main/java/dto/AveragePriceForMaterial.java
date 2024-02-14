package dto;

public class AveragePriceForMaterial {
    public int orderMaterialNumber;
    public double averagePrice;

    public AveragePriceForMaterial(int orderMaterialNumber, double averagePrice) {
        this.orderMaterialNumber = orderMaterialNumber;
        this.averagePrice = averagePrice;
    }

    public int getOrderMaterialNumber() {
        return orderMaterialNumber;
    }

    public void setOrderMaterialNumber(int orderMaterialNumber) {
        this.orderMaterialNumber = orderMaterialNumber;
    }

    public AveragePriceForMaterial() {
    }


    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    @Override
    public String toString() {
        return "AveragePriceForMaterial{" +
                "orderMaterialNumber=" + orderMaterialNumber +
                ", averagePrice=" + averagePrice +
                '}';
    }
}
