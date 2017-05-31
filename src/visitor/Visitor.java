package visitor;

import visitor.elements.Element1;
import visitor.elements.Element2;
import visitor.elements.Element3;

/**
 * Created by micpah on 2017-05-31.
 */
public interface Visitor {
    void visit(Element1 element);
    void visit(Element2 element);
    void visit(Element3 element);
}
