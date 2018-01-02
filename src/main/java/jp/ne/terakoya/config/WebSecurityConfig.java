//package jp.ne.terakoya.config;
//
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//
//	@Override
//	public void configure(WebSecurity web) {
//		web.ignoring().antMatchers("/resources/**");
//	}
//
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//
//		http.authorizeRequests()
//			.antMatchers("/css/**", "/fonts/**", "/js/**", "/images/**").permitAll()
//			.antMatchers("/", "/login").permitAll()
//			.anyRequest().authenticated();
//
//		http.formLogin()
//			.loginProcessingUrl("/login")
//			.loginPage("/login")
//			.failureUrl("/login?error")
//			.defaultSuccessUrl("/top", true)
//			.usernameParameter("loginId")
//			.passwordParameter("password")
//			.permitAll();
//
//		http.logout()
//			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//			.logoutSuccessUrl("/")
//			.deleteCookies("JSESSIONID")
//			.invalidateHttpSession(true)
//			.permitAll();
//	}
//}
