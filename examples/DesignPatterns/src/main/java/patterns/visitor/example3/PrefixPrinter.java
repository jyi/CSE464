package patterns.visitor.example3;

public class PrefixPrinter {
    private final Node root;

    public PrefixPrinter(Node root) {
        this.root = root;
    }

    public String visit() {
        return visit(root);
    }

    // multiple cases are jammed into a single method
    // what happens when we want to add more types of nodes?
    // what happens when we want to make some changes?
    // what happens when we forget to handle some cases?
    private String visit(Node node) {
        StringBuilder sb = new StringBuilder();
        if (node instanceof PlusNode) {
            PlusNode plusNode = (PlusNode) node;
            sb.append("(+ ");
            Node[] ops = plusNode.getOperands();
            sb.append(visit(ops[0]));
            sb.append(" ");
            sb.append(visit(ops[1]));
            sb.append(")");
        } else if (node instanceof IntNode){
            IntNode intNode = (IntNode) node;
            sb.append(intNode.getNum());
        }
        return sb.toString();
    }
}
