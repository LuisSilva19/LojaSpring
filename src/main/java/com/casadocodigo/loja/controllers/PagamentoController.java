package com.casadocodigo.loja.controllers;
//
//import com.casadocodigo.loja.service.ShoppingCartService;
//import com.casadocodigo.loja.domain.PaymentData;
//import com.casadocodigo.loja.domain.User;
//import lombok.RequiredArgsConstructor;
//import org.springframework.mail.MailSender;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.client.HttpClientErrorException;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import java.util.concurrent.Callable;
//
//@RequestMapping("/pagamento")
//@Controller
//@RequiredArgsConstructor
//public class PagamentoController {
//
//
//	private ShoppingCartService carrinho;
//	private RestTemplate restTemplate;
//	private MailSender sender;
//
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
//}
