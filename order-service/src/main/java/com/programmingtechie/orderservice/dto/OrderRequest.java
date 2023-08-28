package com.programmingtechie.orderservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data // to get default boilerplate annotation for the class like getter and setters
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

    private List<OrderLineItemsDto> orderLineItemsDtoList;

}
