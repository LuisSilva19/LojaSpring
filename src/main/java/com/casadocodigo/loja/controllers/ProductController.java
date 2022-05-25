package com.casadocodigo.loja.controllers;

import com.casadocodigo.loja.dto.ProductDTO;
import com.casadocodigo.loja.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

	private final ProductService productService;
	
	@PostMapping("file/record")
	public ProductDTO add(@RequestBody ProductDTO productDTO, @RequestParam("file") MultipartFile file) {
		return productService.record(productDTO, file);
	}

	@PostMapping("record")
	public ProductDTO add(@RequestBody ProductDTO productDTO) {
		return productService.record(productDTO);
	}
	
	@GetMapping("/{productId}")
	public ProductDTO getProductById(@PathVariable("productId")Integer productId) {
		return productService.getProductById(productId);
	}
	
	@GetMapping("/get")
	public List<ProductDTO> listProducts() {
		return productService.getProducts();
	}
	
	@DeleteMapping("/{productId}")
	public void deleteProduct(@PathVariable("productId")Integer productId){
		productService.deleteProduct(productId);
	}
	
}









