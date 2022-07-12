package com.webfilm.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.webfilm.handler.LoginSuccessHandler;
@Configuration
@EnableWebSecurity
@EnableTransactionManagement
@ComponentScan("springmvc.demo")
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired 
	private UserDetailsService userDetailsService;
	@Autowired 
	private AuthenticationSuccessHandler logSuccessHandler;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
	@Bean
	public AuthenticationSuccessHandler loginSuccessHandler() {
		return new LoginSuccessHandler();
	}
	
	//phan quyen
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//		.antMatchers("/").hasRole("EMPLOYEE")
//		.antMatchers("/customer").hasRole("ADMIN")
//		.anyRequest().authenticated()
//		.and().formLogin()
//			.loginPage("/login")
//			.loginProcessingUrl("/dangnhap")
//			.permitAll()
//		.and().logout()
//		.permitAll()
//		.and()
//		.exceptionHandling().accessDeniedPage("/access-denied");
		http.formLogin().loginPage("/login")
		.usernameParameter("name")
		.passwordParameter("pass");
		http.formLogin().defaultSuccessUrl("/home").failureUrl("/login?error");
		http.formLogin().successHandler(this.logSuccessHandler);
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/customer/**").access("hasRole('ROLE_ADMIN')");
		http.csrf().disable();
	}
	@Override
	public void configure(WebSecurity web) {
		web.ignoring().antMatchers("/resources/**");
	}
}
