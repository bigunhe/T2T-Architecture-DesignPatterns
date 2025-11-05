package AbstractFactory;

public class LightButton implements Button{

    @Override
    public void paint() {
        System.out.println("Painting light button");
    }
}
