package com.casadocodigo.loja.service;

import com.casadocodigo.loja.convert.ProductConverter;
import com.casadocodigo.loja.domain.PriceType;
import com.casadocodigo.loja.domain.Product;
import com.casadocodigo.loja.dto.ProductDTO;
import com.casadocodigo.loja.utils.FileSaver;
import com.casadocodigo.loja.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final Product product;
    private final FileSaver fileSaver;
    private final ProductConverter productConverter;

    public ProductDTO record(ProductDTO productDTO, MultipartFile file) {
        fileSaver.write(file);
        return productConverter.getProductDTO(productRepository.save(product));
    }

    public BigDecimal forPrice(PriceType priceType) {
        return product.getPrices().stream()
                .filter(price -> price.getType().equals(priceType))
                .findFirst().get().getValue();
    }

    public ProductDTO getProductById(Integer productId) {
        return productConverter.getProductDTO(productRepository.getProductById(productId));
    }

    public List<ProductDTO> getProducts(){
        return productRepository.getList().stream()
                .map(product -> productConverter.getProductDTO(product))
                .collect(Collectors.toList());
    }

    @Modifying
    public void deleteProduct(Integer productId) {
        productRepository.deleteById(productId);
    }

    public Integer getAmountProducts(Integer productId ) {
         return productRepository.getAmount(productId).size();
    }

}
