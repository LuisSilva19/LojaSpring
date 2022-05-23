package com.casadocodigo.loja.repository;

import com.casadocodigo.loja.domain.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {

    @Query(value = "select * from shopping_cart", nativeQuery = true)
    Optional<ShoppingCart> getProductById();

    @Query(value = "select count(product) from shopping_cart where id = :shoppingCartId", nativeQuery = true)
    Integer getAmountProduct(@Param("shoppingCartId")Integer shoppingCartId);
}
