import java.util.Scanner;

/**
 * @ClassName TestScanner
 * @Description 测试键盘输入
 * @Author edz
 * @Date 2021/4/29 6:45 下午
 * @Version 1.0
 **/
public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name  =  scanner.nextLine();
        System.out.println("请输入爱好：");
        String favor  =  scanner.nextLine();
        System.out.println("请输入年龄：");
        String age  =  scanner.nextLine();


        System.out.println(name); // rebecca
        System.out.println(favor); //打篮球
        System.out.println(age); //23

    }
}
