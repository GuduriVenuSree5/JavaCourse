class Ex1 {
    public static void main(String[] args) {
        //byte b=34;
        int a=257;
        byte b= (byte)a; // we know byte has only 256(-128 to 127) values but a has large value, in this case it will perform modulo operation.(257%256=1)
        System.out.println(b);
    }
}
