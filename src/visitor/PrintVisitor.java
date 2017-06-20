package visitor;

import composite.Operand;
import composite.Operator;

/**
 * Created by micpah on 2017-05-31.
 */
public class PrintVisitor implements Visitor<String> {

    private String result;

    @Override
    public void visit(Operand element) {
        result = element.getStringRepresentation();
    }

    @Override
    public void visit(Operator element) {
        result = element.getStringRepresentation();
    }

    @Override
    public String process(Operator element, String left, String right) {
        element.accept(this);
        return "(" + left + result + right + ")";
    }

    public String process(Operand component) {
        component.accept(this);
        return result;
    }
}
