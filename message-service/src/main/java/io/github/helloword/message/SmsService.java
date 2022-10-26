package io.github.helloword.message;

import org.springframework.plugin.core.Plugin;
import org.springframework.stereotype.Service;

@Service
public class SmsService implements NotifyService {


    @Override
    public boolean supports(Message delimiter) {
        return "sms".equalsIgnoreCase(delimiter.getType());
    }

    @Override
    public String notify(Message message) {

        return "sms  notify  message";
    }
}
