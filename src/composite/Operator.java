package composite;

import java.security.InvalidParameterException;

/**
 * ---- COMPOSITE ----
 * Created by micpah on 2017-05-31.
 */
public abstract class Operator implements Component {
    public Component first;
    public Component last;


    public Operator withCompontents(Component... compontents) {
        for (Component component : compontents) {
            add(component);
        }
        return this;
    }

    public void add(Component c) {
        if (first == null) {
            first = c;
        } else if (last == null) {
            last = c;
        } else {
            throw new InvalidParameterException("NO!");
        }
    }

    public abstract void print();

    public abstract int evaluate();

}
