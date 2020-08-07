import java.util.Date;

public class Message {
    public static void showMessage(Pelayan user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}