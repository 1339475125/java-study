/**
 * 测试常量
 * @author rebecca
 */
public class TestConstant {
    public static void main(String[] args) {
        int age = 18; // age
        String name = "rebecca";
        final double PI = 3.14;
//        PI = 3.14;  // 不能修改final常量值，不能再被赋值
        name  = "rb";
        double r = 4;
        double  area = PI * r * r;
        double circle = 2 * PI * r;
    }
}
