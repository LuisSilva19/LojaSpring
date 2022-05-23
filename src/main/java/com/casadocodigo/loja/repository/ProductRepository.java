package com.casadocodigo.loja.repository;

import com.casadocodigo.loja.domain.PriceType;
import com.casadocodigo.loja.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(value = "select distinct(p) from product p " +
			"join price on (price.id = product.id", nativeQuery = true)
	List<Product> getList();

	@Query(value = "select distinct(p) from product p " +
			"join price on (price.id = product.id) " +
			"where product.id = :productId", nativeQuery = true)
	Product getProductById(@Param("productId") Integer productId);
	
	@Query(value = "select sum(price.value) from product p " +
			"join price on (price.id = product.id) " +
			"where price.type = :priceType ", nativeQuery = true)
	BigDecimal sumPricesByType(@Param("priceType")PriceType priceType);

	@Query(value = "select amount from product where id = :productId", nativeQuery = true)
	List<Integer> getAmount(@Param("productId")Integer productId);
}










