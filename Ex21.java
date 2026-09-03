// Method Overriding
class Calc{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
class AdvCalc extends Calc{
    public int add(int n1,int n2){
        return n1+n2+1;
    }
}
public class Ex21 {
    public static void main(String[] args) {
        AdvCalc cal=new AdvCalc();
        int r=cal.add(3,4);
        System.out.println(r);
    }
}
