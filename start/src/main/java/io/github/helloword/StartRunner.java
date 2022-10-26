package io.github.helloword;

import io.github.helloword.message.Message;
import io.github.helloword.message.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.plugin.core.PluginRegistry;
import org.springframework.stereotype.Component;

@Component
public class StartRunner implements CommandLineRunner {

    @Autowired
    private PluginRegistry<NotifyService, Message> pluginRegistry;



    @Override
    public void run(String... args) throws Exception {
        Message message = new Message();
        message.setType("sms");
        pluginRegistry.getPluginFor(message).ifPresent(s->{
            String notify = s.notify(message);
            System.out.println(notify);
        });
    }
}
