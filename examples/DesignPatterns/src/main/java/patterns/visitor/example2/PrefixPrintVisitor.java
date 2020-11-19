package patterns.visitor.example2;

public class PrefixPrintVisitor extends DefaultVisitor {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(IntNode intNode) {
        sb.append(intNode.getNum());
    }

    @Override
    public void visit(PlusNode plusNode) {
        sb.append("(+ ");
        for (Node operand: plusNode.getOperands()) {
            operand.accept(this);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
    }

    public String getString() {
        return sb.toString();
    }
}
