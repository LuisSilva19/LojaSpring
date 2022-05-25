package com.casadocodigo.loja.convert;

import com.casadocodigo.loja.domain.ShoppingCart;
import com.casadocodigo.loja.dto.ShoppingCartDTO;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartConverter {
    public ShoppingCartDTO getShoppingCartDTO(ShoppingCart shoppingCart){
        return ShoppingCartDTO.builder()
                .id(shoppingCart.getId())
                .priceType(shoppingCart.getPriceType())
                .product(shoppingCart.getProducts())
                .build();
    }

    public ShoppingCart getShoppingCart(ShoppingCartDTO shoppingCartDTO){
        return ShoppingCart.builder()
                .id(shoppingCartDTO.getId())
                .priceType(shoppingCartDTO.getPriceType())
                .products(shoppingCartDTO.getProduct())
                .build();
    }
}
