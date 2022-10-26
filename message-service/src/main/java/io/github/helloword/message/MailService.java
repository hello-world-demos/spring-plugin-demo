package io.github.helloword.message;

import org.springframework.stereotype.Service;

@Service
public class MailService implements NotifyService{
    @Override
    public String notify(Message message) {
        return "mail notify message";
    }

    @Override
    public boolean supports(Message delimiter) {
        return "mail".equalsIgnoreCase(delimiter.getType());
    }
}
