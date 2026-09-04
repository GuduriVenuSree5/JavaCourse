// Method Overriding



class Calc1{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
class AdvCalc1 extends Calc1{
    public int add(int n1,int n2){
        return n1+n2+1;
    }
}
public class Ex21 {
    public static void main(String[] args) {
        AdvCalc1 cal=new AdvCalc1();
        int r=cal.add(3,4);
        System.out.println(r);
    }
}
