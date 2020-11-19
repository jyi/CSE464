package patterns.observer.example1;

import org.junit.Test;
import patterns.observer.example1.BinObserver;
import patterns.observer.example1.HexObserver;
import patterns.observer.example1.OctObserver;
import patterns.observer.example1.Subject;

public class ObserverTest {
    @Test
    public void observerTest() {
        Subject sub = new Subject();
        // Client configures the number and type of Observers
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);

        int[] numArray = {1, 10, 15};
        for (int num : numArray) {
            sub.setState(num);
            System.out.println();
        }
    }
}
