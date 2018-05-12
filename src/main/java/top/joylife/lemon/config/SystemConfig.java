package top.joylife.lemon.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="lemon")
@Data
public class SystemConfig {

    private String theme;
}
