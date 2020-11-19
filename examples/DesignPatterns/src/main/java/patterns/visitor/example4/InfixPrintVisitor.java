package patterns.visitor.example4;

public class InfixPrintVisitor extends DefaultVisitor {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(IntNode intNode) {
        sb.append(intNode.getNum());
    }

    @Override
    public void visit(PlusNode plusNode) {
        sb.append("(");
        Node[] operands = plusNode.getOperands();
        operands[0].accept(this);
        sb.append(" + ");
        operands[1].accept(this);
        sb.append(")");
    }

    @Override
    public void visit(MinusNode minusNode) {
        sb.append("(");
        Node[] operands = minusNode.getOperands();
        operands[0].accept(this);
        sb.append(" - ");
        operands[1].accept(this);
        sb.append(")");
    }

    public String getString() {
        return sb.toString();
    }
}
