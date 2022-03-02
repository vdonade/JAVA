package binod.suman.spring_security_demo_first.security;

import org.hibernate.bytecode.enhance.internal.tracker.NoopCollectionTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import binod.suman.spring_security_demo_first.service.UserInfoService;

@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserInfoService userInfoService;
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userInfoService);
	}
	
	@Bean
	public PasswordEncoder getPassEncoded() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	// Authorization Setting
	public void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
		  .antMatchers("/admin").hasAuthority("ADMIN")
		  .antMatchers("/user").hasAuthority("USER")
		  .antMatchers("/").permitAll()
		  .and()
		  .formLogin();
		  
	}
	
}
