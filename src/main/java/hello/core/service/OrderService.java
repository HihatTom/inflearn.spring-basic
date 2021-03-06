package hello.core.service;

import hello.core.order.Order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

    int getOrder (Order order);
}
