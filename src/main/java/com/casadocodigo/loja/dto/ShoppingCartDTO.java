package com.casadocodigo.loja.dto;

import com.casadocodigo.loja.domain.PriceType;
import com.casadocodigo.loja.domain.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
public class ShoppingCartDTO {
    private Integer id;
    private List<Product> product;
    private PriceType priceType;
    private LocalDate createdAt;
    private LocalDate lastModifiedAt;
    private LocalDate deleteAt;

}
