/**
 * @ClassName TestOverload
 * @Description 函数重载
 * @Author edz
 * @Date 2021/4/30 11:28 上午
 * @Version 1.0
 **/
public class TestOverload {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
    }

    public static int add(int n1, int n2){
        int sum  = n1 + n2;
        return sum;
    }

    public static int add(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        return sum;
    }
}
