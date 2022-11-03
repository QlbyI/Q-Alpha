package 集合;

import java.util.ArrayList;

public class 特点等 {
    /*

    1,集合大小不确定，数组类型确定，长度固定
    2，数组适合数据个数和类型确定的场景，集合相反

     */

    // Arrayist
    // public boolean add(E e) 添加数据到 list 末尾
    // public

    public static void main(String[] args){
        ArrayList list = new ArrayList(); // 构造器构建对象

        // 添加数据

        list.add("java");
        list.add("小鸟游星野");

        System.out.println(list);

        list.add(1,"alis"); //添加到指定位置

        System.out.println(list);
    }

}
