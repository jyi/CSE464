package patterns.visitor.groovy

class MinusNode extends OpNode {
    private Node[] operands;

    public MinusNode(Node left, Node right) {
        operands = new Node[] {left, right};
    }

    @Override
    public Node[] getOperands() {
        return operands;
    }
}
