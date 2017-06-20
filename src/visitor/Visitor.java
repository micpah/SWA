package visitor;

import composite.Operand;
import composite.Operator;

/**
 * Created by micpah on 2017-05-31.
 */
public interface Visitor<T> {
    void visit(Operand element);
    void visit(Operator element);
    T process(Operator element, T left, T right);
    T process(Operand component);
}
