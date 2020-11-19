package patterns.observer.example1;

public class OctObserver extends Observer {
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add( this );
    }

    public void update() {
        System.out.println("[OctObserver]" + Integer.toOctalString(subject.getState()));
    }
}
