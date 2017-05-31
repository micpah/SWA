package composite;

/**
 * ---- COMPOSITE ----
 * Created by micpah on 2017-05-31.
 */
public class Operator implements Component {
    private Component[] children = new Component[9];
    private int total = 0;
    private String operator;

    public Operator(String operator) {
        this.operator = operator;
    }

    public Operator withCompontents (Component ... compontents) {
        for (Component component:compontents){
            add(component);
        }
        return this;
    }

    public void add(Component c) {
        children[total++] = c;
    }

    public void print() {
        System.out.print(operator);
        for (int i = 0; i < total; i++) {
            children[i].print();
        }
    }


}
