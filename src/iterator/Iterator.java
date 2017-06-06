package iterator;

/**
 * Created by micpah on 2017-05-31.
 */
public class Iterator<T> {
    int currentPosition = -1;
    private T[] elements;
    public Iterator(T[] elements) {
        this.elements = elements;
    }
    public T next() {
        return elements[++currentPosition];
    }
    public T previous() {
        return elements[--currentPosition];
    }
    public boolean isDone(){
        return currentPosition >= elements.length -1;
    }
}
