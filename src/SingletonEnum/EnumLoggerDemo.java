package SingletonEnum;

public class EnumLoggerDemo {

    public static void main(String[] args) {

        LoggerEnum obj1 =  LoggerEnum.INSTANCE;
        obj1.log("First message");

        LoggerEnum obj2 = LoggerEnum.INSTANCE;
        obj2.log("Second message");
    }
}
