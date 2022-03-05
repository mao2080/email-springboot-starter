package email.starter.service;

import email.starter.properties.EmailProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * AWS SES邮件发送实现
 */
public class AwsSesEmailServiceImpl implements EmailService{

    private EmailProperties.MailConfig mailConfig;

    public AwsSesEmailServiceImpl(EmailProperties.MailConfig mailConfig) {
        this.mailConfig = mailConfig;
    }

    @Override
    public boolean sendMail(String message) {
        System.out.println(mailConfig.toString()+" SendEmail->message："+message);
        return true;
    }

}