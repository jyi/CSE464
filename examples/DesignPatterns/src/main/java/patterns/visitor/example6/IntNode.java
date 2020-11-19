package patterns.visitor.example6;

public class IntNode extends NumNode {
    private final int num;

    public IntNode(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public int getVal() {
        return getNum();
    }

    @Override
    public String getPrefixNotation() {
        return Integer.toString(num);
    }
}
