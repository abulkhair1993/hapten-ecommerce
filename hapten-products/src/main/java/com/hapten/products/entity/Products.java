package com.hapten.products.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Products {
    private int productId;
    private String productName;
    private String category;

}
