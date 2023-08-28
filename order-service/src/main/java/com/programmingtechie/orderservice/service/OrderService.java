package com.programmingtechie.orderservice.service;

import com.programmingtechie.orderservice.dto.OrderLineItemsDto;
import com.programmingtechie.orderservice.dto.OrderRequest;
import com.programmingtechie.orderservice.model.Order;
import com.programmingtechie.orderservice.model.OrderLineItems;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    public void placeOrder(OrderRequest orderRequest){

        Order order = new Order();

        //set the field
        order.setOrderNumber(UUID.randomUUID().toString());

        // WE ARE GETTING OrderLineItemsDto IN THE REQUEST SO WE FIRST NEED TO CONVERT THE DTO TO LISTITEMS
      List<OrderLineItems> orderLineItems =  orderRequest.getOrderLineItemsDtoList().stream()
                .map(this::mapTOLineItems)
                .toList();

      order.setOrrderLineItemList(orderLineItems);
    }

    private OrderLineItems mapTOLineItems(OrderLineItemsDto orderLineItemsDto) {

        OrderLineItems orderLineItems = new OrderLineItems();

        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderLineItems;
    }
}
