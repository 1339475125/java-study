/**
 * @ClassName TestMethod
 * @Description 测试方法
 * @Author edz
 * @Date 2021/4/30 11:19 上午
 * @Version 1.0
 **/
public class TestMethod {

    public static void main(String[] args) {
        // 通过对象调用普通方法
        TestMethod tm = new TestMethod();
        tm.printSxt();
        tm.printSxt();
        int x = tm.add(30,20,20) + 1000;
        System.out.println(x);
    }

    void printSxt(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }

    int add(int a, int b, int c){
        int sum = a + b +c ;
        System.out.println(sum);
        return sum; //结束方法运行， 2返回值
    }
}
