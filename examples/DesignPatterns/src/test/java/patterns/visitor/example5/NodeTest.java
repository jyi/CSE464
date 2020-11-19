package patterns.visitor.example5;

import org.junit.Test;

public class NodeTest {

    @Test
    public void prefixPrinterTest() {
        PlusNode root = new PlusNode(
                new MinusNode(new IntNode(1), new IntNode(2)),
                new IntNode(3));
        PrefixPrinter pp = new PrefixPrinter(root);
        System.out.println(pp.visit());
    }

}
