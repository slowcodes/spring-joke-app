package ng.com.bitsystems.springjokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringJokeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJokeAppApplication.class, args);
    }

}
