package interfaces;

import dto.AveragePrice;
import dto.AveragePriceForMaterial;
import dto.Order;
import dto.OrderMaterialQty;

import java.util.ArrayList;
import java.util.List;

public interface OrderOperationProxy {
    void addOrderList(); // malzemeleri listeye ekle

    double totalAmountOfMaterial();// 1 a

    ArrayList<AveragePrice> averagePrice();// 1 b

    ArrayList<AveragePriceForMaterial> averagePriceForMaterial(); // 1 c

    ArrayList<OrderMaterialQty> orderMaterialQty(); // 1 d

}
