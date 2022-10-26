package io.github.helloword;

import io.github.helloword.message.NotifyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.plugin.core.config.EnablePluginRegistries;

@EnablePluginRegistries(NotifyService.class)
@SpringBootApplication
public class StartApp {



    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }
}
