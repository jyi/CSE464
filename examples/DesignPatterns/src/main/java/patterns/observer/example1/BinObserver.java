package patterns.observer.example1;

public class BinObserver extends Observer {
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.println("[BinObserver]" + Integer.toBinaryString(subject.getState()));
    }
}
