package iterator;

import composite.Component;

/**
 * Created by johannes on 06.06.17.
 */
public class PrintIterator extends Iterator<String> {

    public PrintIterator(Component operator) {
        super(operator);
    }

    public String traverse(Component component) {
        if (component == null) {
            return "";
        }
        return component.getStringRepresentation( traverse(component.getLeft()), traverse(component.getRight()));
    }
}

