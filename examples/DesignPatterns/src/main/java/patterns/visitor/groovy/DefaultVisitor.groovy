package patterns.visitor.groovy

class DefaultVisitor implements NodeVisitor {
    @Override
    public void visit(IntNode intNode) {
    }

    @Override
    public void visit(PlusNode plusNode) {
        for (Node operand: plusNode.getOperands()) {
            visit(operand);
        }
    }

    @Override
    public void visit(MinusNode minusNode) {
        for (Node operand: minusNode.getOperands()) {
            visit(operand);
        }
    }
}
