/**
 * @ClassName TestOperate01
 * @Description TODO
 * @Author edz
 * @Date 2021/4/29 3:49 下午
 * @Version 1.0
 **/
public class TestOperate01 {
    public static void main(String[] args) {
        byte a =1;
        int b = 2;
        long b2 = 3;
//        byte c = a + b; // int转byte报错
//        int c2 = a + b2; //long
        float f1 = 3.14F;
        double d = b + b2;
        double d2 = f1 + 6.2; //一个数是double 结果为double

        //取模运算
        System.out.println(9%5);
        //自增自减
        int j = 3;
        int h = j++; //执行完后，h=3,先给h赋值，再自增。
        System.out.println("j=" + j +"\n"+ "h="+ h);
        j = 3;
        h = ++j; //先自增再给h赋值
        System.out.println("j=" + j +"\n"+ "h="+ h);
        /*
         * j=4
         * h=3
         * j=4
         * h=4
         */
    }

}
