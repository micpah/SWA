package visitor;

/**
 * Created by micpah on 2017-05-31.
 */
public interface Element {
    void accept(Visitor v);
}
