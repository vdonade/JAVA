package binod.suman.spring_security_demo_first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	
	@GetMapping("/")
	public String home() {
		return "<h1>This is Home page</h1>";
		
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h1>This is Admin page</h1>";
		
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1>This is User page</h1>";
		
	}

}
