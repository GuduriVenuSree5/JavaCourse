
class Mobile{
    String brand;
    int price;
    static String name;  // if we want the name(value) should be the same to every obj then we can use static keyword
    public void show(){
      System.out.println(brand+":"+price+":"+name);
    }  
    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand+":"+obj.price+":"+name);
    }    
}
public class Ex13 {
    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        //obj1.name="smartphone";
        Mobile.name="smartphone";  // static variable can be called with class name

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1700;
        obj2.name="smartphone";
        
        Mobile.show1(obj1);
        

    }
}
