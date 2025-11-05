package AbstractFactory;

public class DarkButton implements Button{

    @Override
    public void paint() {
        System.out.println("Painting dark button");
    }
}
