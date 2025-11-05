package SingletonLazyInitialization;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class  LazyLogger{
    //    declare a static object.
    //    don't initialize.
    //    initialize in the main method.
    private static LazyLogger logger;

    //    create a private constructor to avoid creating objects of this class from outside this class/main method
    private LazyLogger(){
        System.out.println("Creating an instance");
    }

    //    create a static method to return the instance(to access the static instance, we need a static method)
    //    the method returns a Singleton instance

//    note - in the below method we can use Synchronized for thread safety- but it's waste of time.
//    ex: things that could be done in 1ms can take as long as 100ms...
//    instead we can use Thread.sleep() in the main method...it's also time-consuming.
//    so, we use Double-Checked Locking...

    public static /* synchronized */ LazyLogger getInstance(){
        if(logger == null){
            synchronized (LazyLogger.class){
                if(logger == null)
                    logger = new LazyLogger();
            }
        }
        return logger;
    }

    public void log(String message){
//        making timestamp
        LocalDateTime currentTime = LocalDateTime.now();
        String timestamp = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(timestamp + " - " + message);
    }
}
