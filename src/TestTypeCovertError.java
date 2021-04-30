/**
 * @ClassName TestTypeCovertError
 * @Description 测试转换常见问题
 * @Author edz
 * @Date 2021/4/29 6:38 下午
 * @Version 1.0
 **/
public class TestTypeCovertError {
    public static void main(String[] args) {
        int money = 1000000000; // 10亿
        int year = 20;
        int total = money * year;
        // 溢出
        System.out.println("total = " + total); // total = -1474836480
        long total1 = money * year;
        System.out.println("total=" + total1); //total=-1474836480
        long total2 = money * ((long) year);
        System.out.println("total=" + total2); // total=20000000000

        //命名问题
        int l = 2; //分不清 1和l
        System.out.println(l + 1); //3

    }
}
