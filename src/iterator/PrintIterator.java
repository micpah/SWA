package iterator;

import composite.Component;
import composite.Operand;
import composite.Operator;

/**
 * Created by johannes on 06.06.17.
 */
public class PrintIterator {

    private Operator operator;

    public PrintIterator(Operator operator) {
        this.operator = operator;
        System.out.println(print(operator));
    }

    public String print(Component component) {
        if (component instanceof Operator) {
            Operator op = (Operator) component;
            return "("+print(op.first) + op.getStringRepresentation() + print(op.last) + ")";
        }
        if (component instanceof Operand) {
            Operand op = (Operand) component;
            return op.getStringRepresentation();
        }
        throw new IllegalStateException("NOPE!");
    }

}
