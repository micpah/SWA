package iterator;

import composite.Component;
import composite.Operand;
import composite.Operator;
import visitor.Visitor;

/**
 * Created by johannes on 06.06.17.
 */
public class PrintIterator extends Iterator<String> {


    public PrintIterator(Component operator, Visitor<String> visitor) {
        super(operator, visitor);
    }

    public String traverse(Component component) {
        if (component == null) {
            return "";
        }
        if (component instanceof Operator){
            Operator operator = (Operator) component;
            return visitor.process(operator, traverse(operator.getLeft()), traverse(operator.getRight()));
        } else {
            return visitor.process((Operand) component);
        }
    }
}

