package top.joylife.lemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class LemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(LemonApplication.class, args);
	}
}
