package composite.operators;

import composite.Operator;
import visitor.Visitor;

/**
 * Created by johannes on 06.06.17.
 */
public class AdditionOperator extends Operator {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getStringRepresentation() {
        return "+";
    }

    @Override
    public int calculate(int left, int right) {
        return left + right;
    }
}