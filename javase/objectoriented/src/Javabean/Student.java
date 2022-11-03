package Javabean;

public class Student {

    //1,private 修饰
    private String tname;
    private int age;
    private String school;

    // 构造器


    public Student() {
    }

    public Student(String tname, int age, String school) {
        this.tname = tname;
        this.age = age;
        this.school = school;
    }

    // 2，提供方法
    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
