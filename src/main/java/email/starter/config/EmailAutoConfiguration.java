package email.starter.config;
 
import email.starter.properties.EmailProperties;
import email.starter.service.AwsSesEmailServiceImpl;
import email.starter.service.SendGridEmailServiceImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration
@EnableConfigurationProperties(EmailProperties.class)
public class EmailAutoConfiguration {
 
    @Bean
    public AwsSesEmailServiceImpl getAwsSesEmailServiceImpl(EmailProperties emailProperties){
        return new AwsSesEmailServiceImpl(emailProperties.getAwsSesConfig());
    }

    @Bean
    public SendGridEmailServiceImpl getSendGridEmailServiceImpl(EmailProperties emailProperties){
        return new SendGridEmailServiceImpl(emailProperties.getSendGridConfig());
    }
 
}