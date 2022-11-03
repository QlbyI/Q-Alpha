package 概述及原理;

import java.util.Scanner;

public class 屏蔽 {
    public static void main(String[] args){
        //键盘录入

        Scanner sc = new Scanner(System.in);
        System.out.println("please input your number:");
        String num = sc.next();

        // 截取

        String before = num.substring(0,3);
        String after = num.substring(7,11);

        System.out.println(before + "****" + after);
    }
}
