package io.github.helloword.message;

import org.springframework.plugin.core.Plugin;

public interface NotifyService extends Plugin<Message> {

    String notify(Message message);


}
