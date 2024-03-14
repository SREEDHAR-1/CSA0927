import java.util.Date;
import java.time.LocalDateTime;
public class SystemDateAndTime {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(" Current System Date and Time: " + currentDate);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current System Date and Time: " + currentDateTime);
    }
}
