package com.haydikodlayalim.listener;

import com.haydikodlayalim.producer.NotificationProducer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {
    @Autowired
    NotificationProducer notificationProducer;

 /*   @Value("${sr.rabbit.queue.listener.queue}")
    private final  String  queueName;
*/
    @RabbitListener(queues = "a-queue")
    public void handleMessage(String json){
        System.out.println("Message received..");
        System.out.println(json);


    }
}
