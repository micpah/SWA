package iterator;

import composite.Component;
import visitor.Visitor;

/**
 * Created by johannes on 06.06.17.
 */
public abstract class Iterator<T> {
    protected final Component operator;
    public Visitor<T> visitor;

    public Iterator(Component operator, Visitor<T> visitor) {
        this.operator = operator;
        this.visitor = visitor;
        System.out.println(traverse(this.operator));
    }

    public abstract T traverse(Component component);
}
