
//class and object
//Method overloading-same method having diff parameters
class Calculator{
    public int add(int n1,int n2)
    {
          return n1+n2;
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    public double add(double n1, int n2)
    {
        return n1+n2;
    }
}
public class Ex7 {
    public static void main(String[] args) {
        int num1=3;
        int num2=5;
        Calculator cal=new Calculator();
        int res=cal.add(num1,num2);
        System.out.println(res);
    }
}
