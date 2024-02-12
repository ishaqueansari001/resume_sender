package com.ishaque.mail;

import com.ishaque.mail.controller.MailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MailApplication {
    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class,args);
    }
    @Bean
    MailService mailService(){
        return new MailService("smtp.gmail.com", 587, "ishtiyaque717@gmail.com", "xvmh isvz vhux gqov");
    }
}
