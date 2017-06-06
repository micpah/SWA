package iterator;

import composite.Component;
import composite.Operand;
import composite.Operator;

/**
 * Created by johannes on 06.06.17.
 */
public class EvaluateIterator {
    private Component operator;

    public EvaluateIterator(Component operator) {
        this.operator = operator;
        System.out.println(evaluate(this.operator));
    }

    public int evaluate(Component component) {
        if (component instanceof Operator) {
            return evaluate((Operator) component);
        }
        if (component instanceof Operand) {
            return evaluate((Operand) component);
        }
        throw new IllegalStateException("NOPE!");
    }

    public int evaluate(Operator op) {
        return op.getValue(evaluate(op.first), evaluate(op.last));
    }

    public int evaluate(Operand op) {
        return op.getValue();
    }
}