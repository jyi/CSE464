package patterns.visitor.example7;

public class EvaluateVisitor extends DefaultVisitor {

    private int result;

    @Override
    public void visit(IntNode intNode) {
        result = intNode.getNum();
    }

    @Override
    public void visit(PlusNode plusNode) {
        Node[] operands = plusNode.getOperands();
        operands[0].accept(this);
        int val1 = result;
        operands[1].accept(this);
        int val2 = result;
        result = val1 + val2;
    }

    @Override
    public void visit(MinusNode minusNode) {
        Node[] operands = minusNode.getOperands();
        operands[0].accept(this);
        int val1 = result;
        operands[1].accept(this);
        int val2 = result;
        result = val1 - val2;
    }

    public int getResult() {
        return result;
    }
}
