package com.casadocodigo.loja.configuration;

//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


//@EnableWebMvcSecurity
public class SecurityConfiguration {
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

//	@Autowired
//	private UsuarioDAO usuarioDao;

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//			.antMatchers("/produtos/form").hasRole("ADMIN")
//			.antMatchers("/ca;rrinho/**").permitAll()
//			.antMatchers("/pagamento/**").permitAll()
//			.antMatchers(HttpMethod.POST, "/produtos").hasRole("ADMIN")
//			.antMatchers(HttpMethod.GET, "/produtos").hasRole("ADMIN")
//			.antMatchers("/produtos/**").permitAll()
//			.antMatchers("/resources/**").permitAll()
//			.antMatchers("/loadbalancer/**").anonymous()
//			.antMatchers("/loadbalancer/**").permitAll()
//			.antMatchers("/").permitAll()
//			.antMatchers("/url-magica-maluca-oajksfbvad6584i57j54f9684nvi658efnoewfmnvowefnoeijn").permitAll()
//			.anyRequest().authenticated()
//			.and().formLogin().loginPage("/login").permitAll()
//			.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//			.and().csrf().disable();
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(usuarioDao)
//			.passwordEncoder(new BCryptPasswordEncoder());
//	}
//
}













