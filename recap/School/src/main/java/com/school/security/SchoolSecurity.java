package com.school.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.school.service.UserService;

@Configuration
@EnableWebSecurity
public class SchoolSecurity {
	
	@Autowired
	private UserDetailsService userDetailsService;

//	Dynamic way to connect with database
	
//	Authentication Provider
	@Bean
	public AuthenticationProvider authProvider() {
		
//		Connect with database and return the object
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		
//		Which DB,Table and all configuration
		daoAuthenticationProvider.setUserDetailsService(userDetailsService);
//		daoAuthenticationProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		
//		it handle decryption of BCrypt
		daoAuthenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder());
		
		return daoAuthenticationProvider;
	}
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
//		CSRF Disable {Http use builder pattern}
		http.csrf(customizer -> customizer.disable());
		
//		Enable Authentication
		http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
		
//		provide form login
//		http.formLogin(Customizer.withDefaults());
		
//		security
		http.httpBasic(Customizer.withDefaults());
		
//		spring Security will never create an HttpSession and it will never use it to obtain the SecurityContext 
		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		return http.build();
	}
	
	
//	 static way to add or set user and password

//	
//	@Bean
//	public UserDetailsService userDetailsService(){
//		UserDetails admin = User
//				.withDefaultPasswordEncoder()
//				.username("admin")
//				.password("admin")
//				.roles("ADMIN")
//				.build();
//		
//		return new InMemoryUserDetailsManager(admin);
//	}
	
}
