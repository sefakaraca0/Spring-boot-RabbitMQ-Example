package springbootrabbitmq.RabbitMQ.model;

import java.io.Serializable;
import java.util.Date;

public class Notification implements Serializable {

    private String notificationid;
    private Date createdAt;
    private boolean Seen;
    private String massage;

    public String getNotificationid() {

        return notificationid;
    }

    public void setNotificationid(String notificationid) {

        this.notificationid = notificationid;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isSeen() {
        return Seen;
    }

    public void setSeen(boolean seen) {
        Seen = seen;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationid='" + notificationid + '\'' +
                ", createdAt=" + createdAt +
                ", Seen=" + Seen +
                ", massage='" + massage + '\'' +
                '}';
    }
}