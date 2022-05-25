package com.casadocodigo.loja.domain;

import lombok.Data;

import java.math.BigDecimal;

import javax.persistence.*;

@Embeddable
@Data
@Entity
public class Price {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private BigDecimal value;
	private PriceType type;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
}









