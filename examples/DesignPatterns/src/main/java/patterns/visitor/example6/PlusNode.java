package patterns.visitor.example6;

// what happens when we want to add more operations?
public class PlusNode extends OpNode {
    private Node[] operands;

    public PlusNode(Node left, Node right) {
        operands = new Node[] {left, right};
    }

    @Override
    public Node[] getOperands() {
        return operands;
    }

    @Override
    public int getVal() {
        int val1 = operands[0].getVal();
        int val2 = operands[1].getVal();
        return val1 + val2;
    }

    @Override
    public String getPrefixNotation() {
        StringBuilder sb = new StringBuilder();
        sb.append("(+ ");
        sb.append(operands[0].getPrefixNotation());
        sb.append(" ");
        sb.append(operands[1].getPrefixNotation());
        sb.append(")");
        return sb.toString();
    }
}
