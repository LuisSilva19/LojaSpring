package com.casadocodigo.loja.convert;

import com.casadocodigo.loja.domain.Product;
import com.casadocodigo.loja.dto.ProductDTO;

public class ProductConverter {
    public ProductDTO getProductDTO(Product product){
        return ProductDTO.builder()
                .id(product.getId())
                .shoppingCart(product.getShoppingCart())
                .amount(product.getAmount())
                .description(product.getDescription())
                .prices(product.getPrices())
                .pages(product.getPages())
                .releaseDate(product.getReleaseDate())
                .summaryPath(product.getSummaryPath())
                .title(product.getTitle())
                .build();
    }
}
