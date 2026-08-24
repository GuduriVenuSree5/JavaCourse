

class Mobile{
    String brand;
    int price;
    static String name;  // if we want the name(value) should be the same to every obj then we can use static keyword
    
    static {
        name="phone";
        System.out.println("In static block");
    }

    Mobile(){
        brand="";
        price=200;
        System.out.println("In constructor");
    }

    public void show(){
      System.out.println(brand+":"+price+":"+name);
    }  
      
}

public class Ex14 {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile obj1=new Mobile();
        // obj1.brand="Apple";
        // obj1.price=1500;
        // Mobile.name="smartphone";

        // Mobile obj2=new Mobile();

        Class.forName("Mobile");  //If we can't create object then class doesn't loads , forName method is used for class loads
    }
}
