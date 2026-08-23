// Static Variable
class Mobile{
    String brand;
    int price;
    static String name;  // if we want the name should be the same to every obj then we can use static keyword
    public void show(){
      System.out.println(brand+":"+price+":"+name);
    }      
}

public class Ex12 {
    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        obj1.name="smartphone";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1700;
        obj2.name="smartphone";

        obj1.name="phone";   //it changes name to every object
        
        obj1.show();
        obj2.show();

    }
}
