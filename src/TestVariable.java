/**
 * 变量申明
 * @author: rebecca
 */
public class TestVariable {
    int a; //成员变量，成员变量会自动初始化
    static  int size; //静态变量，从属与类
    public static void main(String[] args) {
        {
            int i; // 局部变量，从属于语句块
//            int j = i + 5; // i没有初始化
            i = 18;
            int j = i + 5;
        }
//        System.out.println(i); // 没有申明i这个变量
        int age; // 局部变量，从属于方法
        age = 18;
        int salary = 3000;
        int gao = 13;
        System.out.println(gao);
    }
}
