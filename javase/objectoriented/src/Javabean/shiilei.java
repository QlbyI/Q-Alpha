package Javabean;

public class shiilei {
    /*
    1，成员变量使用 private 修饰
    2.提供成员变量对应的 setXxx|getXxx（） 方法
    3.必须提供一个 无参构造器 ，有参随意

     */

    public static void main(String[] args){

        Student s = new Student();
        s.setTname("小鸟游星野");
        s.setAge(17);
        s.setSchool("阿拜多斯");
        System.out.println(s.getTname());
        System.out.println(s.getAge());
        System.out.println(s.getSchool());

        System.out.println("------------");

        Student s2 = new Student("yuuka",16,"千年");
        System.out.println(s2.getTname());
        System.out.println(s2.getAge());
        System.out.println(s2.getSchool());



    }
}
