package com.casadocodigo.loja.convert;

import com.casadocodigo.loja.domain.Product;
import com.casadocodigo.loja.dto.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    public ProductDTO getProductDTO(Product product){
        return ProductDTO.builder()
                .id(product.getId())
                .productsShoppingCart(product.getProductsShoppingCart())
                .amount(product.getAmount())
                .description(product.getDescription())
                .prices(product.getPrices())
                .releaseDate(product.getReleaseDate())
                .title(product.getTitle())
                .build();
    }

    public Product getProduct(ProductDTO productDTO){
        return Product.builder()
                .id(productDTO.getId())
                .productsShoppingCart(productDTO.getProductsShoppingCart())
                .amount(productDTO.getAmount())
                .description(productDTO.getDescription())
                .prices(productDTO.getPrices())
                .releaseDate(productDTO.getReleaseDate())
                .title(productDTO.getTitle())
                .build();
    }
}
