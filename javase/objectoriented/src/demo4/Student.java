package demo4;

public class Student {

    String name;
    int age;
    public Student(){
        System.out.println("无参数构造器中的this:" +this);
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void ttk(String name){
        System.out.println(this.name +"正在和" + name + "ttk");
    }


    public void atk(){
        System.out.println("方法中的this："+this);
    }
}
