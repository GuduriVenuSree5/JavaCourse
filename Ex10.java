//Array of objects

class Student{
    int sid;
    String sname;
    int smarks;
}

public class Ex10 {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.sid=1;
        s1.sname="anju";
        s1.smarks=90;

        Student s2=new Student();
        s2.sid=2;
        s2.sname="sree";
        s2.smarks=80;

        Student s3=new Student();
        s3.sid=2;
        s3.sname="ram";
        s3.smarks=88;

        Student s[]=new Student[3];  // all objects become part of s array
        s[0]=s1;
        s[1]=s2;
        s[2]=s3;
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i].sname +":"+s[i].smarks);
        }

        //using for-each loop/ enhanced for loop
        for(Student stu:s){
            System.out.println(stu.sname +":"+stu.smarks);
        }
        
    }
}
