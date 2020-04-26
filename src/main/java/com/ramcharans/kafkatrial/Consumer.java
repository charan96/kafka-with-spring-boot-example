package com.ramcharans.kafkatrial;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.MessageFormat;

@Service
public class Consumer {
    @KafkaListener(topics = Producer.TOPIC, groupId = "group_id")
    public void consume(String message) throws IOException {
        System.out.println(MessageFormat.format("#### -> Consumed message -> {0}", message));
    }
}
