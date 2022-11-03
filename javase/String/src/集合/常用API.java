package 集合;

import java.util.ArrayList;

public class 常用API {
    public static void main(String[] args){
        ArrayList<String> list= new ArrayList<String>();
        list.add("基沃托斯");
        list.add("千年");
        list.add("SEIN");
        list.add("祝福");
        list.add("Alis");
        list.add("Yuuka");
        list.add("诺亚");
        System.out.println(list);

        //public E get(int index): 获取某个索引位置的元素值
        String l1 = list.get(1);
        System.out.println(l1);

        //public int size():获取集合大小

        int l2 = list.size();
        System.out.println(l2);
        System.out.println(list.size());

        //遍历集合

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //public E remove(int index):删除某个索引位置都值，并返回被删除的元素值

        list.remove(2);

        //public boolean remove(Object o):直接删除元素值，成功返回 true 失败则为 false

        System.out.println(list.remove("Yuuka"));

        //public E set(int index,E element):修改某个索引位置的值

        list.set(2,"Nicht");
        System.out.println(list);




    }
}
