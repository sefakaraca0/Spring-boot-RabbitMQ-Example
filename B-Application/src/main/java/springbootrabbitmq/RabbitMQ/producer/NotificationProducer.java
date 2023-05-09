package springbootrabbitmq.RabbitMQ.producer;

import jakarta.annotation.PostConstruct;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;
import springbootrabbitmq.RabbitMQ.RabbitMqApplication;
import springbootrabbitmq.RabbitMQ.dto.KisiDto;
import springbootrabbitmq.RabbitMQ.model.Notification;

import java.util.Date;
import java.util.UUID;

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
