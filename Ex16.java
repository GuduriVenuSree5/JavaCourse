// this keyword
class Human{
    private int age;
    private String name;

    public void setAge(int age)
    {
        this.age=age;  // this refers to current obj of the method setAge
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
public class Ex16 {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setAge(21);
        obj.setName("sree");
        
        System.out.println(obj.getName()+":"+obj.getAge());

    }
}
