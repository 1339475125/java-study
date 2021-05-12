package cn.gm.oop;

import java.util.Locale;

/**
 * @ClassName TestString2
 * @Description 测试String的常用方法
 * @Author edz
 * @Date 2021/5/8 10:38 上午
 * @Version 1.0
 **/
public class TestString2 {
    public static void main(String[] args) {
        String s1 = "core Java";
        String s2 = "Core Jvaa";
        System.out.println(s1.charAt(3)); //提取下标为3的字符串

        System.out.println(s2.length()); //长度

        System.out.println(s1.equals(s2)); // 是否相等
        System.out.println(s1.equalsIgnoreCase(s2)); //比较两个字符串大小(忽略大小写)

        System.out.println(s1.indexOf("Java")); //字符串是否包含Java
        System.out.println(s1.indexOf("apple"));

        String s = s1.replace(" ", "&"); // 替换，生成新的对象
        System.out.println("result is: " + s);

        String s3 = "";
        String s4 = "How are you?";

        System.out.println(s4.startsWith("How")); // 是否以How开头
        System.out.println(s4.endsWith("you")); //是否以you结尾

        s = s4.substring(4); // 提取字符串：从下标为4的开始到结尾结束
        System.out.println(s);

        s = s4.substring(4, 7); // 提取字符串，下标[4, 7]不包括7
        System.out.println(s);

        s = s4.toLowerCase(); // 转小写
        System.out.println(s);

        s = s4.toUpperCase(); //转大写
        System.out.println(s);

        String s5 = "How old are you?";
        s = s5.trim();// 去除收尾的空格，生成新的字符串
    }
}
