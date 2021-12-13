package md.utm.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class SsoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsoDemoApplication.class, args);
	}
}
