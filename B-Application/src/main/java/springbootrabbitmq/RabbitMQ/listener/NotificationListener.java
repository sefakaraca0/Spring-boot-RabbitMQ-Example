package springbootrabbitmq.RabbitMQ.listener;

import com.google.gson.Gson;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootrabbitmq.RabbitMQ.dto.KisiDto;
import springbootrabbitmq.RabbitMQ.model.Notification;
import springbootrabbitmq.RabbitMQ.producer.NotificationProducer;

@Service
public class NotificationListener {

    @Autowired
    NotificationProducer notificationProducer;

    @RabbitListener(queues = "b-queue")
    public void handleMessage(String json){
        System.out.println("Message received..");
        System.out.println(json);

      notificationProducer.sendToQueue("{\"statu\":\"200\"}");
    }
}
