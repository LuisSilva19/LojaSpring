package com.casadocodigo.loja.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@EntityListeners(AuditingEntityListener.class)
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String description;
	private Integer amount;
	@CreatedDate
	private Date createdAt;
	@LastModifiedDate
	private LocalDate lastModifiedAt;
	private LocalDate deleteAt;
	private LocalDate releaseDate;

	@JsonIgnore
	@ManyToMany(mappedBy = "products")
	private List<ShoppingCart> productsShoppingCart;

	@JsonIgnore
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Price> prices;
}




