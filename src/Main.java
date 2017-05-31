import composite.Operand;
import composite.Operator;

/**
 * Created by micpah on 2017-05-31.
 */
public class Main {
    public static void main(String[] args) {

        Operator first = new Operator("*");
        first.withCompontents(
                new Operator("+").withCompontents(new Operand("a"),new Operand("b")),
                new Operator("-").withCompontents(new Operand("a"),new Operand("c"))
        );
        Operator second = new Operator("-");
        second.withCompontents(
                new Operator("*").withCompontents(new Operand("b"),new Operand("d")),
                new Operand("a")
        );

        Operator operator = new Operator("+").withCompontents(first,second);
        operator.traverse();
    }
}
