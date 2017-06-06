package iterator;

import composite.Component;
import composite.Operand;
import composite.Operator;

/**
 * Created by johannes on 06.06.17.
 */
public class EvaluateIterator {
    private Operator operator;

    public EvaluateIterator(Operator operator) {
        this.operator = operator;
        System.out.println(evaluate(operator));
    }

    public int evaluate(Component component) {
        if (component instanceof Operator) {
            Operator op = (Operator) component;
            return op.getValue(evaluate(op.first), evaluate(op.last));
        }
        if (component instanceof Operand) {
            Operand op = (Operand) component;
            return op.getValue();
        }
        throw new IllegalStateException("NOPE!");
    }
}
