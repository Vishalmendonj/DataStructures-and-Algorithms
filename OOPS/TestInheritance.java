package OOPS;
class Student{
    String name;
    int age;
    float height;

    public void getInfo(int age, double d){
        System.out.println(age);
        System.out.println(d);
    }
    public void getInfo(double age, int height){
        System.out.println(age);
        System.out.println(height);
    }
}
public class TestInheritance {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="vishal";
        s1.age=23;
        s1.height=57;
        // s1.getInfo(23,  53);

    }
}
