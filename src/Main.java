import composite.Operand;
import composite.Operator;
import composite.Variable;

/**
 * Created by micpah on 2017-05-31.
 */
public class Main {
    public static void main(String[] args) {

        Operand.values.put(Variable.A, 1);
        Operand.values.put(Variable.B, 2);
        Operand.values.put(Variable.C, 3);
        Operand.values.put(Variable.D, 4);

        Operator first = new Operator("*");
        first.withCompontents(
                new Operator("+").withCompontents(new Operand(Variable.A), new Operand(Variable.B)),
                new Operator("-").withCompontents(new Operand(Variable.A), new Operand(Variable.C))
        );
        Operator second = new Operator("-");
        second.withCompontents(
                new Operator("*").withCompontents(new Operand(Variable.B), new Operand(Variable.D)),
                new Operand(Variable.A)
        );

        Operator operator = new Operator("+").withCompontents(first, second);
        operator.print();
    }
}
