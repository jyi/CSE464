package patterns.visitor.example2;

public class IntNode extends NumNode {
    private final int num;

    public IntNode(int num) {
        this.num = num;
    }

    @Override
    public void accept(NodeVisitor v) {
        v.visit(this);
    }

    public int getNum() {
        return num;
    }
}
