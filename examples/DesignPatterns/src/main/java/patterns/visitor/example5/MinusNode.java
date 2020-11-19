package patterns.visitor.example5;

public class MinusNode extends OpNode {
    private Node[] operands;

    public MinusNode(Node left, Node right) {
        operands = new Node[] {left, right};
    }

    @Override
    public Node[] getOperands() {
        return operands;
    }
}
