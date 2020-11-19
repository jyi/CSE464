package patterns.decorator.example1;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void espresso() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ": "
                + beverage.cost() + "won");
    }

    @Test
    public void doubleMocha() {
        Beverage beverage = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(beverage.getDescription() + ": "
                + beverage.cost() + "won");
    }
}
