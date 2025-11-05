package SingletonLazyInitialization;

public class LazyLoggerDemo {

    public static void main(String[] args) {
        //        in non thread-safe, non-lazy instance...

//        LazyLogger log1 = LazyLogger.getInstance();
//        log1.log("First message");
//
//        LazyLogger log2 = LazyLogger.getInstance();
//        log2.log("Second message");
//
//        LazyLogger log3 = LazyLogger.getInstance();
//        log3.log("Third message");


//        using threads to log the messages...
//        when using threads, the order changes...

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyLogger log1 = LazyLogger.getInstance();
                log1.log("First message");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyLogger log1 = LazyLogger.getInstance();
                log1.log("second message");
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazyLogger log1 = LazyLogger.getInstance();
                log1.log("third message");
            }
        });

        t1.start();
//        try{
//            Thread.sleep(10);
//        }catch(Exception e){}

        t2.start();
//        try{
//            Thread.sleep(10);
//        }catch(Exception e){}

        t3.start();

    }
}
