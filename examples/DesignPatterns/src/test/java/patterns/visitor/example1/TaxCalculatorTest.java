package patterns.visitor.example1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaxCalculatorTest {

    @Test
    public void test1() {
        List<Product> products = new ArrayList<>();
        Collections.addAll(products, new Book(200), new Book(300));

        NormalPassenger p = new NormalPassenger();
        p.purchase(products);

        System.out.println(TaxCalculator.calculate(products));
    }
}
