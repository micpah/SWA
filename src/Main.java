import composite.Operand;
import composite.Operator;
import composite.Variable;
import composite.operators.AdditionOperator;
import composite.operators.MultiplicationOperator;
import composite.operators.SubstrationOperator;

/**
 * Created by micpah on 2017-05-31.
 */
public class Main {
    public static void main(String[] args) {
        Operand.values.put(Variable.A, 1);
        Operand.values.put(Variable.B, 2);
        Operand.values.put(Variable.C, 3);
        Operand.values.put(Variable.D, 4);

        Operator first = new MultiplicationOperator();
        first.withCompontents(
                new AdditionOperator().withCompontents(new Operand(Variable.A), new Operand(Variable.B)),
                new SubstrationOperator().withCompontents(new Operand(Variable.A), new Operand(Variable.C))
        );
        Operator second = new SubstrationOperator();
        second.withCompontents(
                new MultiplicationOperator().withCompontents(new Operand(Variable.B), new Operand(Variable.D)),
                new Operand(Variable.A)
        );

        Operator operator = new AdditionOperator().withCompontents(first, second);
        operator.print();
        System.out.println();
        System.out.println(operator.evaluate());
    }
}
