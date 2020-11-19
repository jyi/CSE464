package patterns.visitor.example7;

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
            // operand.accept(this);
            if (operand instanceof IntNode) {
                visit((IntNode) operand);
            } else if (operand instanceof PlusNode) {
                visit((PlusNode) operand);
            } else if (operand instanceof MinusNode) {
                visit((MinusNode) operand);
            }
            // wouldn't it be nice if we can simply call
            // visit(operand)?
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
    }
}
