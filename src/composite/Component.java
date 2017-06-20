package composite;

import visitor.EvaluateVisitor;
import visitor.PrintVisitor;
import visitor.Visitor;

/**
 * Created by micpah on 2017-05-31.
 */
public interface Component {
    abstract void accept(Visitor visitor);
}
