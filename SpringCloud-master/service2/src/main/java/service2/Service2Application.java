package service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service2Application {
    @RequestMapping("/service2")
    public String service2(){
        return "service2";
    }

    protected static final Logger logger = LoggerFactory.getLogger(Service2Application.class);
    public static void main(String[] args) {
        logger.info("Spring Boot service2 start");
        SpringApplication.run(Service2Application.class, args);
        logger.info("Spring Boot service2 end");
    }
}
