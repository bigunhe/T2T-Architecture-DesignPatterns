package Singleton;

public class LoggerDemo {

    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        Logger log3 = Logger.getInstance();

        log1.log("First message");
        log2.log("Second message");
        log3.log("Third message");
    }
}
