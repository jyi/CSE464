package patterns.decorator.example1;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast";
    }

    @Override
    public int cost() {
        return 2500;
    }
}
