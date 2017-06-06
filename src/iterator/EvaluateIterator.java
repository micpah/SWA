package iterator;

import composite.Component;

/**
 * Created by johannes on 06.06.17.
 */
public class EvaluateIterator extends Iterator<Integer>{


    public EvaluateIterator(Component operator) {
        super(operator);
    }

    public Integer traverse(Component component) {
        if (component == null) {
            return 0;
        }
        return component.getValue(traverse(component.getLeft()), traverse(component.getRight()));
    }
}