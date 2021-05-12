package cn.gm.oo;

/**
 * @ClassName TestArry02
 * @Description 数组测试
 * @Author edz
 * @Date 2021/5/6 3:44 下午
 * @Version 1.0
 **/
public class TestArry02 {
    public static void main(String[] args) {
        int[] a = {2, 3,4}; //静态初始化
        User[] b = {
                new User(1001, "dsd"),
                new User(1002, "fewff"),
                new User(1003, "dsdwfwf")};
        //默认初始化
        int[] c = new int[3]; //默认给数组的元素进行赋值，赋值的规则和成员变量默认赋值规则一致
        // 动态初始化
        int[] a1 = new int[2];
        a1[0] = 0;
    }
}
