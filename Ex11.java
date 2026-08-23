class Ex11{
    //String Builder- used for mutable string(changable) 
    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer("venu");

        sb.append(" sree");
        sb.insert(0," java ");

        String s=sb.toString();

        System.out.println(s);
    }
}