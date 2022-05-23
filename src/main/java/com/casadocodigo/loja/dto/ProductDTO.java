package com.casadocodigo.loja.dto;


import com.casadocodigo.loja.domain.Price;
import com.casadocodigo.loja.domain.ShoppingCart;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
public class ProductDTO {
	private Integer id;
	private String title;
	private String description;
	private Integer pages;
	private String summaryPath;
	private Integer amount;
	private LocalDate releaseDate;
	private ShoppingCart shoppingCart;
	private List<Price> prices;
	private LocalDate createdAt;
	private LocalDate lastModifiedAt;
	private LocalDate deleteAt;
}







