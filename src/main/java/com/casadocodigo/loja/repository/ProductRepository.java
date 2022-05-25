package com.casadocodigo.loja.repository;

import com.casadocodigo.loja.domain.PriceType;
import com.casadocodigo.loja.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(value = "select * from product ", nativeQuery = true)
	List<Product> getList();

	@Query(value = "select distinct(pro) from product pro " +
			"join price pri on (pri.id = pro.id) " +
			"where product.id = :productId", nativeQuery = true)
	Optional<Product> getProductById(@Param("productId") Integer productId);
	
	@Query(value = "select sum(pri.value) from product pro " +
			"join pri on (pri.id = pro.id) " +
			"where pri.type = :priceType ", nativeQuery = true)
	BigDecimal sumPricesByType(@Param("priceType")PriceType priceType);

	@Query(value = "select amount from product where id = :productId", nativeQuery = true)
	List<Integer> getAmount(@Param("productId")Integer productId);

}










