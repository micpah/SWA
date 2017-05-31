import composite.Operand;
import composite.Operator;

/**
 * Created by micpah on 2017-05-31.
 */
public class Main {
    public static void main(String[] args) {

        Operand.values.put(Operand.Variable.A, 1);
        Operand.values.put(Operand.Variable.B, 2);
        Operand.values.put(Operand.Variable.C, 3);
        Operand.values.put(Operand.Variable.D, 4);

        Operator first = new Operator("*");
        first.withCompontents(
                new Operator("+").withCompontents(new Operand(Operand.Variable.A),new Operand(Operand.Variable.B)),
                new Operator("-").withCompontents(new Operand(Operand.Variable.A),new Operand(Operand.Variable.C))
        );
        Operator second = new Operator("-");
        second.withCompontents(
                new Operator("*").withCompontents(new Operand(Operand.Variable.B),new Operand(Operand.Variable.D)),
                new Operand(Operand.Variable.A)
        );

        Operator operator = new Operator("+").withCompontents(first,second);
        operator.traverse();
    }
}
