/**
 * @ClassName TestOperate4
 * @Description TODO
 * @Author edz
 * @Date 2021/4/29 4:42 下午
 * @Version 1.0
 **/
public class TestOperate4 {
    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        System.out.println(a&b); //0
        System.out.println(a|b); //7
        System.out.println(a^b);//7
        System.out.println(~a);//-4

        int c = 3 << 2;
        System.out.println(c); // 左移两位 相当于*2 *2  12
        System.out.println(12 >> 1); // 右移一位，相当于除以2  6

    }
}
