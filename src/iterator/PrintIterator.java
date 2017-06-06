package iterator;

import composite.Component;
import composite.Operand;
import composite.Operator;

/**
 * Created by johannes on 06.06.17.
 */
public class PrintIterator {

    private Component operator;

    public PrintIterator(Component operator) {
        this.operator = operator;
        System.out.println(print(this.operator));
    }

    public String print(Component component) {
        if (component instanceof Operator) {
            Operator op = (Operator) component;
            return "(" + print(op.first) + op.getStringRepresentation() + print(op.last) + ")";
        }
        if (component instanceof Operand) {
            Operand op = (Operand) component;
            return op.getStringRepresentation();
        }
        throw new IllegalStateException("NOPE!");
    }

}
