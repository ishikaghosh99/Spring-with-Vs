package demo.isthesiteup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IsTheSiteUpApplication {

@GetMapping(value="/hello")
public String getMethodName(){
	return "Hello";
}

	public static void main(String[] args) {
		SpringApplication.run(IsTheSiteUpApplication.class, args);
	}

}
