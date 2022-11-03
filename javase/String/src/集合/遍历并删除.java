package 集合;

import java.util.ArrayList;

public class 遍历并删除 {
    /*
    某班级考试成绩为 98 89 78 77 69 83 79
    将成绩 80 分以下的数据删除
     */

    /*

     */

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(98);
        list.add(89);
        list.add(78);
        list.add(77);
        list.add(69);
        list.add(83);
        list.add(79);
        System.out.println(list);

        for (int i = 0 ; i < list.size(); i++) {
            int score = list.get(i);
            if(score < 80){
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }

}
