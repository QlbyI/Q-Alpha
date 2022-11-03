package 概述及原理;

import java.util.Scanner;

public class 比较 {
    public static void main(String[] args){

        String Account = "qlby";
        String password = "46656";

        Scanner sc = new Scanner(System.in);
        System.out.println("please input the account:");
        String a = sc.next();
        System.out.println("please input the password:");
        String p = sc.next();

        // equals 比较内容

        if(Account.equals(a) && password.equals(p)){
            System.out.println("login successfuly");
        }else {
            System.out.println("your account or password is wrong.");
        }

        // equalsIgnoreCase  比较内容且忽略大小写

        String power = "vergil";
        String konwledge = "VERGIL";
        System.out.println(power.equalsIgnoreCase(konwledge));
    }
}
