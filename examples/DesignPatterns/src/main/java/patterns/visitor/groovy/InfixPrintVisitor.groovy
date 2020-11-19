package patterns.visitor.groovy

class InfixPrintVisitor extends DefaultVisitor {
    private StringBuilder sb = new StringBuilder();

    def getString() {
        sb.toString();
    }

    @Override
    public void visit(IntNode intNode) {
        sb.append(intNode.getNum());
    }

    @Override
    public void visit(PlusNode plusNode) {
        sb.append("(");
        Node[] operands = plusNode.getOperands();
        visit(operands[0]);
        sb.append(" + ");
        visit(operands[1]);
        sb.append(")");
    }

    @Override
    public void visit(MinusNode minusNode) {
        sb.append("(");
        Node[] operands = minusNode.getOperands();
        visit(operands[0]);
        sb.append(" - ");
        visit(operands[1]);
        sb.append(")");
    }
}
