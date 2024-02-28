package mogueye.com.learningspb.service;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "currency-service")
@Data
public class CurrencyServiceConfiguration {
    private String username;
    private String url;
    private String key;

}
