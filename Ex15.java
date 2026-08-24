
//Encapsulation - Data hiding + controlled access to data.
class Human{
    private int age;
    private String name; // instead of accessing variables directly these variable can be make use through methods

    public void setAge(int a)
    {
        age=a;
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

public class Ex15 {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setAge(10);
        obj.setName("sree");
        System.out.println(obj.getName()+":"+obj.getAge());
    }
}
