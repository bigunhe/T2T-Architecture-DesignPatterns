package AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

//        light factory
        AbstractFactory light = new LightThemeFactory();

        Button lb = light.createButton();
        Checkbox lc = light.createCheckbox();
        System.out.println("Light factory...");
        lb.paint();
        lc.check();

        System.out.println();

//        dark factory
        AbstractFactory dark = new DarkThemeFactory();

        Button db = dark.createButton();
        Checkbox dc = dark.createCheckbox();
        System.out.println("Dark factory...");
        db.paint();
        dc.check();

    }
}
