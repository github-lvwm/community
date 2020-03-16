package life.mirko.community.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CommunityDemoApplication {

    public static void main(String[] args) {
        //Spring应用启动起来
        SpringApplication.run(CommunityDemoApplication.class, args);
    }
}
