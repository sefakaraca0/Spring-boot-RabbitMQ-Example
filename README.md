# Spring Boot RabbitMQ Docker Example
*Bu proje, Spring Boot ve RabbitMQ kullanarak basit bir mesaj kuyruğu uygulamasını Docker üzerinde çalıştırmak için tasarlanmıştır. Mesaj kuyruğu, bir mesajı üretici tarafından gönderilen ve bir veya daha fazla tüketici tarafından alınan bir iletişim modelidir.* <br>
![banner resmi](https://github.com/sefakaraca0/Spring-boot-RabbitMQ-Example/blob/main/images/readme-banner.png)
## Başlangıç
*Bu talimatlar, projenin Docker üzerinde nasıl çalıştırılacağını anlatmaktadır.*
### Önkoşullar
 *Bu projenin çalıştırılması için aşağıdaki yazılımların yüklü olması gerekmektedir:<br>*
* *Java 17 veya üzeri*
* *RabbitMQ*
* *Docker*
* *Docker Compose*
 ### Kurulum
 *1. Bu depoyu klonlayın:* <br>
`git clone https://github.com/sefakaraca0/Spring-boot-RabbitMQ-Example` <br>
*2.  Proje klasörüne gidin:*<br>
`cd Spring-boot-RabbitMQ-Example`<br>
*3. Docker imajını oluşturun:*<br>
`docker build -t Spring-boot-RabbitMQ-Example `<br>
### Çalıştırma
*1.  Docker Compose kullanarak proje ve RabbitMQ konteynerini başlatmak için aşağıdaki komutu çalıştırın:* <br>
 *`docker-compose up -d`* <br>
*2. Uygulama başarıyla başlatıldıktan sonra, http://localhost:8080 adresine erişebilirsiniz.*
### Kullanım
*Uygulama başarıyla çalıştığında, aşağıdaki adımları izleyerek mesaj kuyruğunu kullanabilirsiniz:* <br>
*1.	POST /kisi/kaydet endpoint'ine bir POST isteği gönderin:*<br> ![Postman](https://github.com/sefakaraca0/Spring-boot-RabbitMQ-Example/blob/main/images/postman.png) <br>
*2.	B Mesaj kuyruğuna başarıyla gönderildikten sonra, b tüketici tarafından mesajın aldığını görebilirsiniz.*<br> ![A App Console](https://github.com/sefakaraca0/Spring-boot-RabbitMQ-Example/blob/main/images/A-app-console.png) <br>
*3. B Mesajı aldıktan sonra , A mesaj kuyruğuna 200 OK Mesajını gönderir ve , a tüketici tarafından da mesajın alındığını görebilirsiniz.* <br> ![B-App Console](https://github.com/sefakaraca0/Spring-boot-RabbitMQ-Example/blob/main/images/B-app-console.png) <br>
### Katkıda Bulunma
*Bu projeye katkıda bulunmak isterseniz, lütfen şu adımları izleyin:*<br>
*1.	Bu depoyu kendi hesabınıza "fork"layın.* <br>
*2.	Yeni bir özellik veya düzeltme için bir dal ("branch") oluşturun.* <br>
*3.	Değişikliklerinizi yapın ve düzenlemeleri yapın.* <br>
*4.	Yaptığınız değişiklikleri "commit"leyip push edin.* <br>
*5.	Yeni dalınızı ana depoya gönderin ("pull request").* <br>
*6.	İnceleme sürecinden geçmesini bekleyin ve gerekirse daha fazla değişiklik yapın.* <br>
*7.	Değişiklikleriniz ana depoya kabul edildiğinde, teşekkürler!*

