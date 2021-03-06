package patterns.visitor.example4;

public interface NodeVisitor {
    void visit(IntNode numNode);
    void visit(PlusNode plusNode);
    void visit(MinusNode MinusNode);
}
