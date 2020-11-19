package patterns.visitor.groovy

class PlusNode extends OpNode {
    private Node[] operands;

    PlusNode(Node left, Node right) {
        operands = new Node[] {left, right};
    }

    @Override
    Node[] getOperands() {
        return operands;
    }
}
