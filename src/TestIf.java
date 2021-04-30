/**
 * @ClassName TestIf
 * @Description 测试if语句
 * @Author edz
 * @Date 2021/4/29 6:58 下午
 * @Version 1.0
 **/
public class TestIf {
    public static void main(String[] args) {
        double d = Math.random(); //随机数据，0-1的随机数
        System.out.println(d);
        // int i = (int) (6 * Math.random());
        // if (i<=3){
        //    System.out.println("小");
        //}
        int i = (int)(6 * Math.random()) + 1;
        int j = (int)(6 * Math.random()) + 1;
        int k = (int)(6 * Math.random()) + 1;
        int count = i + j + k;
        if (count > 15){
            System.out.println("今天手气不错");
        }
        if(count >= 10 && count <= 15){
            System.out.println("今天手气一般");
        }
        if(count < 10){
            System.out.println("今天手气不怎么样");
        }

    }
}
