package com.ramcharans.kafkatrial;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaTrialApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaTrialApplication.class, args);
    }

    // @Bean
    // public NewTopic topic() {
    //     return new NewTopic("users", 3, (short) 2);
    // }
}
