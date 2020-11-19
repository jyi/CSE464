package patterns.visitor.example2;

import org.junit.Test;

public class VisitorTest {

    @Test
    public void prefixPrinterVisitorTest() {
        Node root = new PlusNode(
                new PlusNode(new IntNode(1), new IntNode(2)),
                new IntNode(3));
        PrefixPrintVisitor pv = new PrefixPrintVisitor();
        root.accept(pv);
        System.out.println(pv.getString());
    }

    @Test
    public void infixPrinterVisitorTest() {
        Node root = new PlusNode(
                new PlusNode(new IntNode(1), new IntNode(2)),
                new IntNode(3));
        InfixPrintVisitor ipv = new InfixPrintVisitor();
        root.accept(ipv);
        System.out.println(ipv.getString());
    }

    @Test
    public void evaluteVisitorTest() {
        Node root = new PlusNode(
                new PlusNode(new IntNode(1), new IntNode(2)),
                new IntNode(3));
        EvaluateVisitor ev = new EvaluateVisitor();
        root.accept(ev);
        System.out.println(ev.getResult());
    }
}
