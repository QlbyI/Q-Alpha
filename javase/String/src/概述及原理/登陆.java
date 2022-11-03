package 概述及原理;

import java.util.Scanner;

public class 登陆 {
    public static void main(String[] args) {

        String account = "qlby";
        String password = "46656";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("please input your account:");
            String login = sc.next();
            System.out.println("please input your password:");
            String lp = sc.next();

            if(account.equals(login)){
                if(password.equals(lp)){    // xxx.equals(yyy) 比较 xxx 与 yyy 内容是否一致
                    System.out.println("login successfully");
                    break;
                    }else {
                    System.out.println("the password you put is wrong");
                }
                }else {
                System.out.println("the account you input is wrong");
            }
            }

        }


    }


