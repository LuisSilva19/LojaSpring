package com.casadocodigo.loja.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Product {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String description;
	private Integer pages;
	private String summaryPath;
	private Integer amount;
	private LocalDate releaseDate;
	@CreatedDate
	private LocalDate createdAt;
	@LastModifiedDate
	private LocalDate lastModifiedAt;
	private LocalDate deleteAt;

	@ManyToMany
	private ShoppingCart shoppingCart;

	@JsonIgnore
	@OneToMany(mappedBy = "product")
	private List<Price> prices;
}







