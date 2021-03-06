package patterns.visitor.example7;

import org.junit.Test;

public class VisitorTest {

    @Test
    public void prefixPrinterVisitorTest() {
        Node root = new PlusNode(
                new MinusNode(new IntNode(1), new IntNode(2)),
                new IntNode(3));
        PrefixPrintVisitor pv = new PrefixPrintVisitor();
        root.accept(pv);
        if (root instanceof IntNode) {
            pv.visit((IntNode) root);
        } else if (root instanceof PlusNode) {
            pv.visit((PlusNode) root);
        } else if (root instanceof MinusNode) {
            pv.visit((MinusNode) root);
        }
        // wouldn't it be nice if we can simply call
        // pv.visit(root);
        System.out.println(pv.getString());
    }

    @Test
    public void infixPrinterVisitorTest() {
        Node root = new PlusNode(
                new MinusNode(new IntNode(1), new IntNode(2)),
                new IntNode(3));
        InfixPrintVisitor ipv = new InfixPrintVisitor();
        root.accept(ipv);
        System.out.println(ipv.getString());
    }

    @Test
    public void evaluteVisitorTest() {
        Node root = new PlusNode(
                new MinusNode(new IntNode(1), new IntNode(2)),
                new IntNode(3));
        EvaluateVisitor ev = new EvaluateVisitor();
        root.accept(ev);
        System.out.println(ev.getResult());
    }

    @Test
    public void infixPrinterVisitorTestOverRoots() {
        Node root1 = new PlusNode(
                new MinusNode(new IntNode(1), new IntNode(2)),
                new IntNode(3));
        Node root2 = new PlusNode(
                new MinusNode(new IntNode(1), new IntNode(2)),
                new MinusNode(new IntNode(5), new IntNode(4)));

        Node[] roots = new Node[] {root1, root2};
        for (Node root: roots) {
            InfixPrintVisitor ipv = new InfixPrintVisitor();
            root.accept(ipv);
            System.out.println(ipv.getString());
        }
    }
}
