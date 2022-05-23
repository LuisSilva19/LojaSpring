package com.casadocodigo.loja.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("payment")
@Controller
@RequiredArgsConstructor
public class PaymentController {

//	@RequestMapping(value="/finalizar", method=RequestMethod.POST)
//	public Callable<ModelAndView> finalizar(
//			RedirectAttributes model) {
//		return () -> {
//			String uri = "http://book-payment.herokuapp.com/payment";
//
//			try {
//				//enviaEmailCompraProduto(usuario);
//				return new ModelAndView("redirect:/produtos");
//			} catch (HttpClientErrorException e) {
//				e.printStackTrace();
//				model.addFlashAttribute("falha", "Valor maior que o permitido");
//				return new ModelAndView("redirect:/produtos");
//			}
//		};
//	}
//
//	private void enviaEmailCompraProduto(User user) {
//		SimpleMailMessage email = new SimpleMailMessage();
//		email.setSubject("Compra finalizada com sucesso");
//		//email.setTo(usuario.getEmail());
//		email.setTo("compras@casadocodigo.com.br");
//		email.setText("Compra aprovada com sucesso no valor de " + carrinho.getTotal());
//		email.setFrom("compras@casadocodigo.com.br");
//
//		sender.send(email);
//	}
//
}
