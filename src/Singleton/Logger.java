package Singleton;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
//    creating a static instance of the class - to be accessed through the class
    private static Logger logger = new Logger();

//    create a private constructor to avoid creating objects of this class from outside this class/main method
    private Logger(){}

//    create a static method to return the instance(to access the static instance, we need a static method)
//    the method returns a Singleton instance
    public static Logger getInstance(){
        return logger;
    }

    public void log(String message){
//        making timestamp
        LocalDateTime currentTime = LocalDateTime.now();
        String timestamp = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(timestamp + " - " + message);
    }
}
