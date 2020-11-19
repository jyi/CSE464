package patterns.visitor.example7;

public class DefaultVisitor implements NodeVisitor {
    @Override
    public void visit(IntNode intNode) {
    }

    @Override
    public void visit(PlusNode plusNode) {
        for (Node operand: plusNode.getOperands()) {
            operand.accept(this);
        }
    }

    @Override
    public void visit(MinusNode minusNode) {
        for (Node operand: minusNode.getOperands()) {
            operand.accept(this);
        }
    }
}
