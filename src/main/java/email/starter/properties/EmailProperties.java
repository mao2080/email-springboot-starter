package email.starter.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
 
/** 
 * @Description: 配置信息实体 
 */
@ConfigurationProperties(prefix = "email")
public class EmailProperties {

    private MailConfig awsSesConfig = new MailConfig();

    private MailConfig sendGridConfig = new MailConfig();

    public MailConfig getAwsSesConfig() {
        return awsSesConfig;
    }

    public MailConfig getSendGridConfig() {
        return sendGridConfig;
    }

    @Getter
    @Setter
    @ToString
    public class MailConfig{

        private String userName;

        private String password;

        private String sender;

    }

}