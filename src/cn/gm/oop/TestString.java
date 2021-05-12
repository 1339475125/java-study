package cn.gm.oop;

/**
 * @ClassName TestString
 * @Description TODO
 * @Author edz
 * @Date 2021/5/7 4:23 下午
 * @Version 1.0
 **/
public class TestString {
    public static void main(String[] args) {
        // 不可变字符序列
        String str = "abc";
        String str2 = new String("def");
        String str3 = "abc" + " defg";
        String str4 = "18" + 19;
        System.out.println(str4);
        System.out.println("###############");
        String str10 = "ffafw";
        String str11 = "fwfwefw";
        System.out.println(str10.equals(str11));
    }
}
