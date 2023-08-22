
interface Notification{
    public void sendNotification(String message);
}



class Sms {

    
    public void sendNotification(String message) {
        System.out.println(message);
    }
    
}

class Email implements Notification{

    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
}

class PushNotification implements Notification{
       
    public void sendNotification(String message) {
        System.out.println(message);
    }
}


class NotificationService {

    Notification notification;


    public NotificationService(Notification notification){
        this.notification=notification;
    }

    public void sendNotification(String message){
        notification.sendNotification(message);
    }

}


public class interfacetest {

    public static void main(String[] args) {
        Notification emailNotification = new Email();
        PushNotification pushNotification=new PushNotification();
        Sms sms=new Sms();
        sms.sendNotification("Hi from Sms!");

        NotificationService emailNotificationService=new NotificationService(emailNotification);
        NotificationService pushNotificationService=new NotificationService(pushNotification);

        emailNotificationService.sendNotification("Hi From email!");
        pushNotificationService.sendNotification("Hi From Push Notification");
        // Here let's say If I want to add another functionality of SMS I don't need to modify NotificationService class
        //This Helps us Acheieve loose Coupling
    }
    
    
    
}
