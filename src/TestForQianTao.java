/**
 * @ClassName TestForQianTao
 * @Description 测试嵌套循环
 * @Author edz
 * @Date 2021/4/30 10:37 上午
 * @Version 1.0
 **/
public class TestForQianTao {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        //乘法表
        for(int n=1; n<=9; n++){
            for(int m=1; m<=n; m++){
                System.out.print(m+"*"+n+"="+(m*n)+"\t");
            }
            System.out.println();
        }
        // 偶数和奇数
        int sum01=0;
        int sum02 =0;
        for (int i=1; i<=100; i++){
            if(i%2==0){
                sum01 += i;
            } else{
                sum02 += i;
            }
        }
        System.out.println(sum01);
        System.out.println(sum02);
        // 1-1000能被5整除的数
        int h =0;
        for(int i =1; i<=1000; i++){
            if(i%5==0){
                System.out.print(i + "\t");
                h++;
                if(h==5){
                    System.out.println();
                    h=0;
                }
            }
        }
    }
}
