/**
 * @ClassName TestFor
 * @Description 测试for循环
 * @Author edz
 * @Date 2021/4/30 10:30 上午
 * @Version 1.0
 **/
public class TestFor
{
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i <=100;i++){
            sum = sum + i;
        }
        System.out.println(sum);
        for(int i=1,j = i+10; i<5; i ++,j=i+2){
            System.out.println(i+"," + j);
        }
    }
}
