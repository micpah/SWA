package visitor;

import composite.Operand;
import composite.Operator;

/**
 * Created by micpah on 2017-05-31.
 */
public class EvaluateVisitor implements Visitor <Integer>{

    Integer result = null;
    private Integer left;
    private Integer right;

    @Override
    public void visit(Operand element) {
        result = element.getValue();
    }

    @Override
    public void visit(Operator element) {
        result = element.calculate(left,right);
    }

    @Override
    public Integer process(Operator element, Integer left, Integer right) {
        this.left = left;
        this.right = right;
        element.accept(this);
        return result;
    }

    @Override
    public Integer process(Operand component) {
        component.accept(this);
        return result;
    }
}
