// Super method
class A{   // By default this parent class extends object class
    A(){
        super();
        System.out.println("in A");
    }
    A(int n){
        super();
        System.out.println("in A");
    }
}
class B extends A{
    public char[] marks;
    B(){
        super();
        System.out.println("in B");
    }
    // B(int n){
    //     super(); // this super keyword calls the constructor in class A
    //     System.out.println("in B int");
    // }
    B(int n){
        this(); // this method execute the constructor of class B which is B()
        System.out.println("in B int");
    }
}
class Ex20{
    public static void main(String[] args) {
        B obj=new B(5);
    }
}