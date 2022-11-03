package demo1;

public class 基沃托斯 {
    public static void main(String[] args){
        student s = new student();

        s.name = "小鸟游星夜";
        s.school="阿拜多斯";
        System.out.println(s.name);
        System.out.println(s.school);
        s.atk();
        s.lover();

        System.out.println("" +
                "");
        student s2 = new student();
        s2.name = "yuuka";
        s2.school = "千禧";
        System.out.println(s2.name);
        System.out.println(s2.school);
        s2.atk();
        s2.lover();

        System.out.println(s);
        System.out.println(s2);
    }

}
