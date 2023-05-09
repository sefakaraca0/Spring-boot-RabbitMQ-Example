package com.haydikodlayalim.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NotificationProducer {

    @Value("${sr.rabbit.routing.name}")
    private String routingName;

    @Value("${sr.rabbit.exchange.name}")
    private String exchangeName;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendToQueue(String json) {
//        String json = "{\n" +
//                "    \"adi\":\"New\",\n" +
//                "    \"soyadi\":\"Karaca\",\n" +
//                "    \"adresler\":[\"Test Adres 1\", \"Test Adres 2\"]\n" +
//                "}";
        System.out.println("Notification Sent : " + json);

        rabbitTemplate.convertAndSend(exchangeName,routingName, json);
    }
}
