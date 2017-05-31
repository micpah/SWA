package composite;

/**
 * --- LEAF ----
 * Created by micpah on 2017-05-31.
 */
public class Operand implements Component {
    private String operand;
    public Operand(String operand) {
        this.operand = operand;
    }

    public void traverse() {
        System.out.print(operand);
    }
}