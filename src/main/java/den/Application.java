package den;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by denis on 27.07.2015.
 */
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        System.out.println("hello!");
        SpringApplication.run(Application.class);
    }
}
