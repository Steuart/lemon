package top.joylife.lemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "top.joylife.lemon.dao.mapper")
public class LemonApplication {

    public static void main(String[] args) {
        SpringApplication.run(LemonApplication.class, args);
    }
}
