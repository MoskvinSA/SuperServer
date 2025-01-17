package com.carservice.CarService.service.api;

import com.carservice.CarService.data.Order;
import com.carservice.CarService.data.dto.OrderDto;

import javax.ws.rs.core.Response;
import java.util.List;

public interface OrderService {

    String submit(Order order);

    void submit(List<Order> orders);

    String changeStatus(Long id, String newStatus);

    List<Order> getAllOrders();

    List<OrderDto> getAllUserOrders(String id);
}
