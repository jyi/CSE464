package patterns.visitor.groovy

class EvaluateVisitor extends DefaultVisitor {
    private int result;

    @Override
    public void visit(IntNode intNode) {
        result = intNode.getNum();
    }

    @Override
    public void visit(PlusNode plusNode) {
        Node[] operands = plusNode.getOperands();
        visit(operands[0]);
        int val1 = result;
        visit(operands[1]);
        int val2 = result;
        result = val1 + val2;
    }

    @Override
    void visit(MinusNode minusNode) {
        Node[] operands = minusNode.getOperands();
        visit(operands[0]);
        int val1 = result;
        visit(operands[1]);
        int val2 = result;
        result = val1 - val2;
    }

    def getResult() {
        result;
    }
}
