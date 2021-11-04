package tw.denny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Denny Yang
 * @since: 2021/11/4
 */
@SpringBootApplication
@RestController
public class DemoApp {

    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }
}
