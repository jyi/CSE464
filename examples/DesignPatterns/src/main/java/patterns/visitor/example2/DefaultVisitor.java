package patterns.visitor.example2;

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
}
