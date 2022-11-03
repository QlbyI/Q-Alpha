package demo4;

import javax.xml.namespace.QName;

public class test {
    public static void main(String[] args) {

        Student s = new Student();
        s.atk();

        System.out.println(s);


        Student S2 = new Student("小鸟游星野", 17);
        System.out.println((S2.name));
        System.out.println(S2.age);

        s.ttk("陆八魔阿鲁");

    }
}



