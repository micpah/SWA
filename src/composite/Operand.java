package composite;

import visitor.EvaluateVisitor;
import visitor.PrintVisitor;
import visitor.Visitor;

import java.util.HashMap;

/**
 * --- LEAF ----
 * Created by micpah on 2017-05-31.
 */
public class Operand implements Component {
    public static HashMap<Variable, Integer> values = new HashMap<>();

    private Variable operand;

    public Operand(Variable operand) {
        this.operand = operand;
    }


    public String getStringRepresentation() {
        return operand.getValue();
    }


    public int getValue() {
        return values.get(operand);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}