package com.casadocodigo.loja.repository;

import com.casadocodigo.loja.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.core.userdetails.UserDetailsService;
//public class UsuarioDAO implements UserDetailsService {
//

//
	@Query(value = "select * from user u where email = :email", nativeQuery = true)
	public User loadUserByUsername(@Param("email")String email);

}













