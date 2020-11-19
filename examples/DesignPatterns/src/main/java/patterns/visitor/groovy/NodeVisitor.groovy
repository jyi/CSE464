package patterns.visitor.groovy

interface NodeVisitor {
    void visit(IntNode numNode);
    void visit(PlusNode plusNode);
    void visit(MinusNode MinusNode);
}