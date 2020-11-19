package patterns.visitor.example5;

public class PlusNode extends OpNode {
    private Node[] operands;

    public PlusNode(Node left, Node right) {
        operands = new Node[] {left, right};
    }

    @Override
    public Node[] getOperands() {
        return operands;
    }
}
