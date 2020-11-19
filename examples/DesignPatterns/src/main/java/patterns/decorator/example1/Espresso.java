package patterns.decorator.example1;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public int cost() {
        return 2000;
    }
}
