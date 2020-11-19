package patterns.visitor.example1;

public class Book implements Product {

    private final double taxRate = 0.1;
    private final double price;

    public Book(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getTax() {
        return price * taxRate;
    }
}
