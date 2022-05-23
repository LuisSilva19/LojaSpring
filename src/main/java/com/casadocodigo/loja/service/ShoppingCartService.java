package com.casadocodigo.loja.service;

import com.casadocodigo.loja.convert.ShoppingCartConverter;
import com.casadocodigo.loja.domain.ShoppingCart;
import com.casadocodigo.loja.dto.ShoppingCartDTO;
import com.casadocodigo.loja.exception.ServiceException;
import com.casadocodigo.loja.repository.ShoppingCartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShoppingCartService {

	private final ShoppingCartRepository shoppingCartRepository;
	private final ShoppingCartConverter shoppingCartConverter;

	public ShoppingCartDTO addShoppingCart(ShoppingCartDTO shoppingCartDTO) {
		ShoppingCart shoppingCart = shoppingCartConverter.getShoppingCart(shoppingCartDTO);
		return shoppingCartConverter.getShoppingCartDTO(shoppingCartRepository.save(shoppingCart));
	}

	public ShoppingCartDTO getById(Integer productId) {
		return shoppingCartConverter.getShoppingCartDTO(shoppingCartRepository.getProductById()
				.orElseThrow(() -> new ServiceException("shoppingCart.getById.notFound")));
	}

	@Modifying
	public void deleteById(Integer productId) {
		shoppingCartRepository.deleteById(productId);
	}

	public Integer getAmount(Integer ShoppingCartId) {
		return shoppingCartRepository.getAmountProduct(ShoppingCartId);
	}

}














