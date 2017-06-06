package composite.operators;

import composite.Operator;

/**
 * Created by johannes on 06.06.17.
 */
public class SubstrationOperator extends Operator {


    @Override
    public int getValue( int first, int last) {
        return first - last;
    }

    @Override
    public String getStringRepresentation(String op1, String op2) {
        return "(" + op1 + "-" + op2 + ")";
    }

}