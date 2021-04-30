import java.net.StandardSocketOptions;

/**
 * @ClassName TestOperate03
 * @Description 逻辑运算符
 * @Author edz
 * @Date 2021/4/29 4:13 下午
 * @Version 1.0
 **/
public class TestOperate03 {
    public static void main(String[] args) {
        boolean b1= true;
        boolean b2 = false;
        System.out.println(b1&b2); // false
        System.out.println(b1|b2);  // true
        System.out.println(b1^b2);  //true
        System.out.println(!b2); //true
//        boolean b3=1>2&2<(3/0); // 报错，后面执行了
//        System.out.println(b3);
        boolean b4=1>2&&2<(3/0); //第一个的值是false，后面的就不执行
        System.out.println(b4); // false

    }
}
