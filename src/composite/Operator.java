package composite;

import java.security.InvalidParameterException;

/**
 * ---- COMPOSITE ----
 * Created by micpah on 2017-05-31.
 */
public abstract class Operator implements Component {
    public Component left;
    public Component right;


    public Operator withCompontents(Component... compontents) {
        for (Component component : compontents) {
            add(component);
        }
        return this;
    }

    public void add(Component c) {
        if (left == null) {
            left = c;
        } else if (right == null) {
            right = c;
        } else {
            throw new InvalidParameterException("NO!");
        }
    }

    @Override
    public Component getLeft() {
        return left;
    }

    @Override
    public Component getRight() {
        return right;
    }
}
