package composite.operators;

import composite.Operator;

/**
 * Created by johannes on 06.06.17.
 */
public class AdditionOperator extends Operator {

    @Override
    public String getStringRepresentation(String op1, String op2) {
        return "(" + op1 + "+" + op2 + ")";
    }

    @Override
    public int getValue( int first, int last) {
        return first + last;
    }
}