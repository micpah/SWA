package composite;

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

    public void print() {
        System.out.print(evaluate());
    }

    public String evaluate() {
        return String.valueOf(values.get(operand));
    }
}