package Builder;

public class BuilderDemo {
    public static void main(String[] args) {

//        Computer c = new Computer("e89", 3, 1000, "T55");      ---- this is the normal way we used to do, but we have to add all parameters to create an object.
//        System.out.println(c);

//        to create an object, we call the builder class with parameters we want to set..(leave ones you don't want to specify, they will be filled with default values)
//        finally call the getComputer method which will return what's being built in the builder class
        Computer gamingPC = new ComputerBuilder().setCPU("i9").setRam(32).setStorage(1000).setGraphicCard("RTX4080").getComputer();

        System.out.println(gamingPC);
    }
}
