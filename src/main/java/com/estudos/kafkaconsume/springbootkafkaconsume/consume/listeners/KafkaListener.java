package com.estudos.kafkaconsume.springbootkafkaconsume.consume.listeners;

import com.estudos.kafkaconsume.springbootkafkaconsume.consume.dto.Employee;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.stereotype.Component;


@Component
@EnableKafka
public class KafkaListener {
    @org.springframework.kafka.annotation.KafkaListener(groupId = "groups", topics = "create-employee-events-e")
    public void listen(Employee data) {
        System.out.println(data.toString());
    }
}
