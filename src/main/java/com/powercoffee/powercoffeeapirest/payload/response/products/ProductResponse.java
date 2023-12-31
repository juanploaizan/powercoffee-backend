package com.powercoffee.powercoffeeapirest.payload.response.products;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private String imageUrl;
    private Double purchasePrice;
    private Double salePrice;
    private Integer stock;
    private String categoryId;
    private String coffeeShopId;
}
