package AbstractFactory;

public class DarkCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Checking dark checkbox");
    }
}
