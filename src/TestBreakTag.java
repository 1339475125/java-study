/**
 * @ClassName TestBreakTag
 * @Description 带标签的break和continue
 * @Author edz
 * @Date 2021/4/30 11:03 上午
 * @Version 1.0
 **/
public class TestBreakTag {
    public static void main(String[] args) {
        // 打印101-150之间的质数
        outer: for (int i=101; i<150; i++){
            for(int j=2; j<i/2; j++){
                if(i%j==0){
                    continue  outer;
                }
            }
            System.out.print(i + "\t"); //101	103	107	109	113	127	131	137	139	149
        }
    }
}
