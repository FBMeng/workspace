package person.bing.testserviceone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("person.bing.testserviceone.*.dao.java")
public class TestServiceOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestServiceOneApplication.class, args);
	}
}
