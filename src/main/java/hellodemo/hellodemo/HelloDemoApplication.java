package hellodemo.hellodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloDemoApplication {
	@GetMapping("/azure")
public String hello() {
	return "hello azure";
}
	public static void main(String[] args) {
		SpringApplication.run(HelloDemoApplication.class, args);
	}

}
