package composite.operators;

import composite.Operator;

/**
 * Created by johannes on 06.06.17.
 */
public class MultiplicationOperator extends Operator {

    public void print() {
        if (first != null && last != null) {
            System.out.print("(");
            first.print();
            System.out.printf("*");
            last.print();
            System.out.print(")");
        } else {
            throw new IllegalStateException("NO!");
        }
    }


    @Override
    public int evaluate() {
        if (first != null && last != null) {
            return first.evaluate() * last.evaluate();
        } else {
            throw new IllegalStateException("NO!");

        }
    }
}
