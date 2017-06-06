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


    @Override
    public String getStringRepresentation(String op1, String op2) {
        return operand.getValue();
    }

    @Override
    public int getValue(int op1, int op2) {
        return values.get(operand);
    }

    @Override
    public Component getLeft() {
        return null;
    }

    @Override
    public Component getRight() {
        return null;
    }
}