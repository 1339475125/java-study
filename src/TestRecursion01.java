/**
 * @ClassName TestRecursion01
 * @Description 测试递归
 * @Author edz
 * @Date 2021/4/30 11:35 上午
 * @Version 1.0
 **/
public class TestRecursion01 {

    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果：%s%n", 10, factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归耗时： %s%n", d2-d1); //43
        factorialLoop(10);
    }

    static long factorial(int n){
        if(n==1){ //递归头
            return 1;
        } else{ //递归体
            return n * factorial(n-1);
        }
    }

    static long factorialLoop(int a){
        long d3 = System.currentTimeMillis();
        long result = 1;
        while(a > 1){
            result *= a * (a - 1);
            a -= 2;
        }
        long d4 = System.currentTimeMillis();
        System.out.printf("迭代耗时： %s%n", d4-d3); //0
        return result;
    }
}

