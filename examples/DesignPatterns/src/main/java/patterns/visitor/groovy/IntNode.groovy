package patterns.visitor.groovy

class IntNode extends NumNode {
    private int num;

    IntNode(int num) {
        this.num = num;
    }

    def getNum() {
        num;
    }
}
