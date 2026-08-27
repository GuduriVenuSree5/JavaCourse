//Constructor types
class Human{
    private int age;
    private String name;

    public Human(){    // default constructor
        age=21;
        name="Sree";
    }
    public Human(int age, String name) // parameterized constructor
    {
        this.age=age;
        this.name=name;
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

public class Ex18 {
    public static void main(String[] args) {
        Human obj=new Human();
        Human obj1=new Human(22,"anju");
        System.out.println(obj.getName()+":"+obj.getAge());
        System.out.println(obj1.getName()+":"+obj1.getAge());
        
    }
}
