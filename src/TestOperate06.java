/**
 * @ClassName TestOperate06
 * @Description 条件运算符
 * @Author edz
 * @Date 2021/4/29 5:44 下午
 * @Version 1.0
 **/
public class TestOperate06 {
    public static void main(String[] args) {
        int score = 80;
        int x = -100;
        String type = score < 60 ? "不及格" : "及格"; //及格
        System.out.println(type);
        System.out.println(x > 0? 1:(x==0?0:-1)); // -1
    }

}
