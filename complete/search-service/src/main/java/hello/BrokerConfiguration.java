package hello;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties(prefix = "brokers")
public class BrokerConfiguration {

    private List<Broker> brokerDetails;

    public List<Broker> getBrokerDetails() {
        return brokerDetails;
    }

    public void setBrokerDetails(List<Broker> brokerDetails) {
        this.brokerDetails = brokerDetails;
    }

    public String getNameForScid(String scid) {
        if (brokerDetails == null) {
            return "";
        }
        final Optional<Broker> optionalBrokerForScid = brokerDetails
                .stream()
                .filter(broker -> broker.getScid().equals(scid))
                .collect(Collectors.reducing((a, b) -> null));

        if (optionalBrokerForScid.isPresent()) {
            return optionalBrokerForScid.get().getName();
        } else {
            return "";
        }
    }
}
