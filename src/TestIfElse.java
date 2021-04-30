/**
 * @ClassName TestIfElse
 * @Description 测试if else
 * @Author edz
 * @Date 2021/4/29 7:14 下午
 * @Version 1.0
 **/
public class TestIfElse {
    public static void main(String[] args) {
        double r = 4 * Math.random();
        double area = Math.PI * Math.pow(r, 2);
        double circle = 2 * Math.PI *r;
        System.out.println("半径为： " + r); //半径为： 1.7190110658524715
        System.out.println("面积为： " + area); //面积为： 9.283403289639102
        System.out.println("周长为： " + circle); // 周长为： 10.800865071843369

        if(area >= circle){
            System.out.println("面积大于等于周长");
        } else {
            System.out.println("周长大于面积");
        }
    }
}
