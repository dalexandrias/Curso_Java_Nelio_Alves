package application;

import entities.enums.OrderStatus;
import entities.order.Order;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        order.setStatus(OrderStatus.PROCESSING);
        System.out.println(order);

        order.setStatus(OrderStatus.SHIPPED);
        System.out.println(order);

        order.setStatus(OrderStatus.DELIVERY);
        System.out.println(order);
    }
}
