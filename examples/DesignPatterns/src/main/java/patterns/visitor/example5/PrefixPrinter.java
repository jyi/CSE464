package patterns.visitor.example5;

public class PrefixPrinter {
    private final Node root;

    public PrefixPrinter(Node root) {
        this.root = root;
    }

    public String visit() {
        return visit(root);
    }

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
        } else if (node instanceof MinusNode) {
            MinusNode minusNode = (MinusNode) node;
            sb.append("(- ");
            Node[] ops = minusNode.getOperands();
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
