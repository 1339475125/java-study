/**
 * @ClassName TestOperate02
 * @Description TODO
 * @Author edz
 * @Date 2021/4/29 4:04 下午
 * @Version 1.0
 **/
public class TestOperate02 {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a == 3); //true
        System.out.println(a != 3); // false
        System.out.println(a < 5); // true
        char b = 'a';
        char b2 = 'c';
        System.out.println((int) b); //强制转型 97
        System.out.println(0+b); // 算数计算中有一个是int结果将是int
        System.out.println(b < b2); // true
    }
}

