package com.akash.Kafka_demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics="akash" ,groupId = "myGroup")
    public void consumeMsg(String msg){
        log.info(format("Message consumed from the topic:: %s",msg));

    }
}
