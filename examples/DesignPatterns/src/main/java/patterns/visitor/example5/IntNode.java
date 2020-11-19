package patterns.visitor.example5;

public class IntNode extends NumNode {
    private final int num;

    public IntNode(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
