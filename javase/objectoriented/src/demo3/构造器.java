package demo3;

public class 构造器 {
    public static void main(String[] args){

        Student s = new Student();
        s.name = "Alis";
        s.age = 00;
        System.out.println(s.name);
        System.out.println(s.age);

        Student s2 = new Student("yuuka",16);
        System.out.println(s2.name);
        System.out.println(s2.age);

    }
}
