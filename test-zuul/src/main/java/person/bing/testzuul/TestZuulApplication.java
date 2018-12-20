package person.bing.testzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy 
public class TestZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestZuulApplication.class, args);
	}
}
