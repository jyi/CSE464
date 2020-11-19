package patterns.visitor.example1;

import java.util.List;

public class TaxCalculator {
    public static double calculate(List<Product> products) {
        return products.stream().mapToDouble(x -> x.getTax()).sum();
    }
}
