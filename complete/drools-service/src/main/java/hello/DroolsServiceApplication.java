package hello;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DroolsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DroolsServiceApplication.class, args);
    }
}

@RefreshScope
@RestController
class MessageRestController {

    @Value("${message}")
    private String message;

    @Value("${general.info}")
    private String generalInfo;

    @Autowired
    private BrokerConfiguration brokerConfig;

    @RequestMapping("/message")
    String getMessage() {
        System.out.println(brokerConfig.getBrokerDetails());
        return this.message;
    }

    @RequestMapping("/applicationConfiguration")
    String getApplicationConfiguration() {
        return message + "<BR>" + generalInfo + "<BR>" + brokerConfig
                .getBrokerDetails()
                .stream()
                .map(Broker::createWebString)
                .collect(Collectors.joining());
    }

}