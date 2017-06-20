package iterator;

import composite.Component;
import composite.Operand;
import composite.Operator;
import visitor.Visitor;

/**
 * Created by johannes on 06.06.17.
 */
public class EvaluateIterator extends Iterator<Integer>{


    public EvaluateIterator(Component operator, Visitor<Integer> visitor) {
        super(operator, visitor);
    }

    public Integer traverse(Component component) {
        if (component == null) {
            return 0;
        }
        if (component instanceof Operator){
            Operator operator = (Operator) component;
            return visitor.process(operator, traverse(operator.getLeft()), traverse(operator.getRight()));
        } else {
            return visitor.process((Operand) component);
        }
    }
}
