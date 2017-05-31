package composite;

import java.util.HashMap;

/**
 * --- LEAF ----
 * Created by micpah on 2017-05-31.
 */
public class Operand implements Component {
    public static HashMap<Variable,Integer> values = new HashMap<>();


    public enum Variable {
        A,B,C,D,E,F
    }

    private Variable operand;
    public Operand(Variable operand) {
        this.operand = operand;
    }

    public void traverse() {
        System.out.print(values.get(operand));
    }
}