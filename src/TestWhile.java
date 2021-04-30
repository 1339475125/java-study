/**
 * @ClassName TestWhile
 * @Description 测试while循环
 * @Author edz
 * @Date 2021/4/30 10:24 上午
 * @Version 1.0
 **/
public class TestWhile {
    public static void main(String[] args) {
        // 计算 1 +2 +3 ...+100 累加的和
        // 暴力
        int i  = 0;
        int sum = 0;
        while (i <=100){
            System.out.println("" + sum + ", "+ i);
            sum = sum + i;
            i++;
        }
        System.out.println(sum); //5050
    }
}
