package demo5.封装;

public class Student {
    //成员变量使用 private 修饰

    private int age;
    private String tname;

    // 提供成套的 getter，setter方法 进行暴露和赋值

    public void setAge(int age){
        if(age >= 0 && age <= 200){
            this.age = age;
        }else{
            System.out.println("嚯嚯嚯");
        }
    }

    public int getAge(){
        return age;
    }
}
