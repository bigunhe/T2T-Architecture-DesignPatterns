package Builder;

public class Computer {
//    CPU, RAM, storage, graphicsCard
    private String CPU;
    private int ram;
    private int storage;
    private String graphicCard;

    public Computer(String CPU, int ram, int storage, String graphicCard) {
        this.CPU = CPU;
        this.ram = ram;
        this.storage = storage;
        this.graphicCard = graphicCard;
    }

//    to string method used just to see what is made
    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", graphicCard='" + graphicCard + '\'' +
                '}';
    }

}
