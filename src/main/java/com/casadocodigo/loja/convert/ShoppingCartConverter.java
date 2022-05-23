package com.casadocodigo.loja.convert;

import com.casadocodigo.loja.domain.ShoppingCart;
import com.casadocodigo.loja.dto.ShoppingCartDTO;

public class ShoppingCartConverter {
    public ShoppingCartDTO getShoppingCartDTO(ShoppingCart shoppingCart){
        return ShoppingCartDTO.builder()
                .id(shoppingCart.getId())
                .priceType(shoppingCart.getPriceType())
                .product(shoppingCart.getProduct())
                .build();
    }

    public ShoppingCart getShoppingCart(ShoppingCartDTO shoppingCartDTO){
        return ShoppingCart.builder()
                .id(shoppingCartDTO.getId())
                .priceType(shoppingCartDTO.getPriceType())
                .product(shoppingCartDTO.getProduct())
                .build();
    }
}
