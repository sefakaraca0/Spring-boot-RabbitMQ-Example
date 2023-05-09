package springbootrabbitmq.RabbitMQ;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springbootrabbitmq.RabbitMQ.model.Notification;
import springbootrabbitmq.RabbitMQ.producer.NotificationProducer;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class RabbitMqApplication {

	@Autowired
	private NotificationProducer notificationProducer;

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqApplication.class, args);
	}

//	@PostConstruct
//	public void sendMessageToQueue() {
//
//		Notification notification = new Notification();
//		notification.setNotificationid(UUID.randomUUID().toString());
//		notification.setCreatedAt(new Date());
//		notification.setMassage("SoftPost platformuna hoşgeldiniz");
//
//		notification.setSeen(Boolean.FALSE);
//
//
//		notificationProducer.sendToQueue(notification);
//	}
}
