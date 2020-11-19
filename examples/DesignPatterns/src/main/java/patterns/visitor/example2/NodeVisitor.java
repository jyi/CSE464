package patterns.visitor.example2;

public interface NodeVisitor {
    void visit(IntNode numNode);
    void visit(PlusNode plusNode);
}
