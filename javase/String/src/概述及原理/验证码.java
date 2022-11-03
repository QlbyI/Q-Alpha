package 概述及原理;

import java.util.Random;

public class 验证码 {
    public static void main(String[] args){
        // 定义可能出现的字符信息
        String dates = "1234567890";


        // 循环6次，随机生成随机索引。并提取索引字符拼接
        String code = "";
        Random r = new Random();
        for(int i = 0 ; i < 6 ; i++){
            int index = r.nextInt(dates.length());
            char c = dates.charAt(index);   // charAt() 提取字符
            code += c;
        }
        System.out.println(code);








    }

}
