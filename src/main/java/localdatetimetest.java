import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class localdatetimetest {
    public static void main(String[] args){
             LocalDateTime now = LocalDateTime.now();
             ZoneId zoneid =ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = now.atZone(zoneid);

    }

    public static void date(LocalDateTime localDateTime) {

    }
}
