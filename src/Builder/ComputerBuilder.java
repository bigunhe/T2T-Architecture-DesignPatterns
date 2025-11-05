package Builder;

public class ComputerBuilder {
    private String CPU;
    private int ram;
    private int storage;
    private String graphicCard;


    //  generate setters and take the return type as the same as builder class...
    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
        return this;
    }


//    toString method to see whats inside
    @Override
    public String toString() {
        return "ComputerBuilder{" +
                "CPU='" + CPU + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", graphicCard='" + graphicCard + '\'' +
                '}';
    }


    //    create the computer based on the values here
    public Computer getComputer(){
        return new Computer(CPU, ram, storage, graphicCard);
    }



}
