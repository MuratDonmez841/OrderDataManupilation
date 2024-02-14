package services;

import dto.*;
import interfaces.OrderOperationProxy;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class OrderOperation implements OrderOperationProxy {
    private Orders orders;

    /**
     * malzemeleri listeye ekle.
     **/
    @Override
    public void addOrderList() {
        ArrayList<Order> ordersArrayList = new ArrayList<>();
        ordersArrayList.add(new Order(1000, 2000, 12, 100.51));
        ordersArrayList.add(new Order(1000, 2001, 31, 200));
        ordersArrayList.add(new Order(1000, 2002, 22, 150.86));
        ordersArrayList.add(new Order(1000, 2003, 41, 250));
        ordersArrayList.add(new Order(1000, 2004, 55, 244));
        ordersArrayList.add(new Order(1001, 2001, 88, 44.531));
        ordersArrayList.add(new Order(1001, 2002, 121, 88.11));
        ordersArrayList.add(new Order(1001, 2004, 74, 211));
        ordersArrayList.add(new Order(1001, 2002, 14, 88.11));
        ordersArrayList.add(new Order(1002, 2003, 2, 12.1));
        ordersArrayList.add(new Order(1002, 2004, 3, 22.3));
        ordersArrayList.add(new Order(1002, 2003, 8, 12.1));
        ordersArrayList.add(new Order(1002, 2002, 16, 94));
        ordersArrayList.add(new Order(1002, 2005, 9, 44.1));
        ordersArrayList.add(new Order(1002, 2006, 19, 90));
        orders = new Orders(ordersArrayList);
    }

    /**
     * ortalama tutar
     **/
    @Override
    public double totalAmountOfMaterial() {
        return orders.getOrdersArrayList().stream()
                .mapToDouble(order -> order.getOrderMaterialUnitPrice() * order.getOrderQty())
                .sum();
    }

    /**
     * b. Üç siparişteki bütün malların ortalama fiyatını bulan java kodu.
     **/
    @Override
    public ArrayList<AveragePrice> averagePrice() {
        return orders.getOrdersArrayList().stream()
                .collect(Collectors.groupingBy(
                        Order::getOrderNumber,
                        Collectors.averagingDouble(Order::getOrderMaterialUnitPrice)
                ))
                .entrySet().stream()
                .map(entry -> new AveragePrice(entry.getKey(), entry.getValue()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * c. Üç siparişteki bütün malların tek tek mal bazlı ortalama fiyatını bulan java kodu.
     **/
    @Override
    public ArrayList<AveragePriceForMaterial> averagePriceForMaterial() {
        return orders.getOrdersArrayList().stream()
                .collect(Collectors.groupingBy(
                        Order::getOrderMaterialNumber,
                        Collectors.averagingDouble(Order::getOrderMaterialUnitPrice)
                ))
                .entrySet().stream()
                .map(orderEntry -> new AveragePriceForMaterial(
                        orderEntry.getKey(),
                        orderEntry.getValue()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * d. Tek tek mal bazlı, malların hangi siparişlerde kaç adet olduğunun çıktısını veren
     * java kodu.
     **/
    @Override
    public ArrayList<OrderMaterialQty> orderMaterialQty() {
        return orders.getOrdersArrayList().stream()
                .collect(Collectors.groupingBy(
                        Order::getOrderNumber,
                        Collectors.groupingBy(
                                Order::getOrderMaterialNumber,
                                Collectors.summingInt(Order::getOrderQty)
                        )
                ))
                .entrySet().stream()
                .flatMap(entry ->
                        entry.getValue().entrySet().stream()
                                .map(entry2 -> new OrderMaterialQty(
                                        entry2.getKey(),
                                        entry.getKey(),
                                        entry2.getValue()
                                ))
                )
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
