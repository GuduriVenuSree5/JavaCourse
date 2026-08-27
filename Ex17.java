//Constructor
class Human{
    private int age;
    private String name;

    public Human(){    // default constructor
        age=21;
        name="Sree";
        System.out.println("In constructor");
    }

    public void setAge(int age)
    {
        this.age=age;  
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
}

public class Ex17 {
    public static void main(String[] args) {
        Human obj=new Human();
        Human obj2=new Human(); // Every time when we create an obj it will call the constructor
        System.out.println(obj.getName()+":"+obj.getAge());
    }
}
