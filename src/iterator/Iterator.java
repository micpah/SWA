package iterator;

import composite.Component;

/**
 * Created by johannes on 06.06.17.
 */
public abstract class Iterator<T> {
    private final Component operator;

    public Iterator(Component operator) {
        this.operator = operator;
        System.out.println(traverse(this.operator));
    }

    public abstract T traverse(Component component);
}
