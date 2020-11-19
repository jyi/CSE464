package patterns.visitor.example6;

import org.junit.Test;

public class NodeTest {

    @Test
    public void prefixNotationTest() {
        PlusNode root = new PlusNode(
                new MinusNode(new IntNode(1), new IntNode(2)),
                new IntNode(3));
        System.out.println(root.getPrefixNotation());
    }

    @Test
    public void evaluationTest() {
        PlusNode root = new PlusNode(
                new MinusNode(new IntNode(1), new IntNode(2)),
                new IntNode(3));
        System.out.println(root.getVal());
    }
}
