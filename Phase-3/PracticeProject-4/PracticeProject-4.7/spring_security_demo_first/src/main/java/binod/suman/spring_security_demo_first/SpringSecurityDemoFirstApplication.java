package binod.suman.spring_security_demo_first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import binod.suman.spring_security_demo_first.controller.DemoController;
import binod.suman.spring_security_demo_first.entity.UserInfo;
import binod.suman.spring_security_demo_first.security.DemoSecurityConfig;
import binod.suman.spring_security_demo_first.service.UserInfoService;

@SpringBootApplication
@Import({
    DemoController.class,
    UserInfo.class,
    UserInfoService.class,
    DemoSecurityConfig.class
})
public class SpringSecurityDemoFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDemoFirstApplication.class, args);
	}

}
