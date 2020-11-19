package patterns.visitor.groovy

abstract class OpNode implements Node {
    abstract Node[] getOperands();
}
