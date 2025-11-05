package SingletonEnum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public enum LoggerEnum {
    INSTANCE;

//    private LoggerEnum(){}

    public void log(String message){
//        making timestamp
        LocalDateTime currentTime = LocalDateTime.now();
        String timestamp = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(timestamp + " - " + message);
    }
}
