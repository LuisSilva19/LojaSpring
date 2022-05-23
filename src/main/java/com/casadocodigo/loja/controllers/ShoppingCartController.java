package com.casadocodigo.loja.controllers;

import com.casadocodigo.loja.domain.PriceType;
import com.casadocodigo.loja.domain.ShoppingCart;
import com.casadocodigo.loja.dto.ShoppingCartDTO;
import com.casadocodigo.loja.service.ShoppingCartService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class ShoppingCartController {

	private final ShoppingCartService shoppingCartService;

	@PostMapping("/add")
	public ShoppingCartDTO addShoppingCart(ShoppingCartDTO shoppingCartDTO) {
		return shoppingCartService.addShoppingCart(shoppingCartDTO);
	}
	
	@GetMapping("/find")
	public ShoppingCartDTO findProduct(Integer productId) {
		return shoppingCartService.getById(productId);
	}

	@Modifying
	@DeleteMapping("/remove")
	public void remove(Integer productId, PriceType priceType) {
		shoppingCartService.deleteById(productId);
	}

}











