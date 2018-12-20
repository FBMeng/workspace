package person.bing.testservicetwo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("person.bing.testservicetwo.*.dao.java")
public class TestServiceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestServiceTwoApplication.class, args);
	}
}
