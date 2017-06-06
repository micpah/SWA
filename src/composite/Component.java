package composite;

/**
 * Created by micpah on 2017-05-31.
 */
public interface Component {
    String getStringRepresentation(String op1, String op2);
    int getValue(int op1, int op2);
    Component getLeft();
    Component getRight();
}
