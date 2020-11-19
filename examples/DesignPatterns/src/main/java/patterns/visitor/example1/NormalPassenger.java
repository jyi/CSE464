package patterns.visitor.example1;

import java.util.List;

public class NormalPassenger implements Passenger {

    private List<Product> items;

    @Override
    public void purchase(List<Product> items) {
        this.items = items;
    }
}
