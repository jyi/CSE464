package patterns.visitor.example4;

public class PrefixPrintVisitor extends DefaultVisitor {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(IntNode intNode) {
        sb.append(intNode.getNum());
    }

    @Override
    public void visit(PlusNode plusNode) {
        sb.append("(+ ");
        handleOperands(plusNode);
        sb.append(")");
    }

    @Override
    public void visit(MinusNode minusNode) {
        sb.append("(- ");
        handleOperands(minusNode);
        sb.append(")");
    }

    public String getString() {
        return sb.toString();
    }

    private void handleOperands(OpNode opNode) {
        for (Node operand: opNode.getOperands()) {
            operand.accept(this);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
    }
}
