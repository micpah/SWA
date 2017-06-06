package composite;

/**
 * Created by micpah on 2017-05-31.
 */
public enum  Variable {
   A("A"),B("B"),C("C"),D("D"),E("E"),F("F");

   private final String a;

   Variable(String a) {
      this.a = a;
   }
   public String getValue(){
      return a;
   }
}
