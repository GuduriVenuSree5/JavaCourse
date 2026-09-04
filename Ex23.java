//Access Modifier
import tools.*;

class A extends Bb {   // Protected variable can be accessed through subclass 
   public int abc() {
     return cost;
   }
}
public class Ex23 {
    public static void main(String[] args) {
        Bb a=new Bb();
        System.out.println(a.marks);
    }
}
