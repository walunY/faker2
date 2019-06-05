package xyz.walun.faker2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "xyz.walun")
@SpringBootApplication
public class Faker2Application {

	public static void main(String[] args) {
		SpringApplication.run(Faker2Application.class, args);
	}

}
