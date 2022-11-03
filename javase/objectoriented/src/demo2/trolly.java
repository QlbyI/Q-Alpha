package demo2;

import java.util.Scanner;

public class trolly {
    /*
    购物车，添加商品，修改购买数量，结算
     */

    public static void main(String[] args){

        //1，定义商品类
        //2.定义购物车对象，使用一个数组表示

        goods[] shopcar = new goods[100];

        //3，搭建界面架构

    }

    private static void paygoods(goods[] shopcar) {
    }

    private static void changegoods(goods[] shopcar) {

    }

    private static void querygoods(goods[] shopcar) {

    }

    private static void addgoods(goods[] shopcar , Scanner sc) {

        System.out.println("请输入您要购买的商品编号（不重复）：");
        int id = sc.nextInt();
        System.out.println("");
        String name = sc.next();
        System.out.println("");
        int buynum = sc.nextInt();
        System.out.println("");
        double pirce = sc.nextDouble();


        goods g = new goods();
        g.id = id;
        g.name = name;
        g.buynum = buynum;
        g.price = pirce;

        for (int i = 0; i < shopcar.length; i++) {
            if(shopcar[i] == null){
                shopcar[i] = g;
                break;
            }
        }
        System.out.println("您的商品已添加完成" + g.name);
    }

}
