package cn.gm.oop;

/**
 * @ClassName TestEnum
 * @Description 测试枚举
 * @Author edz
 * @Date 2021/5/10 4:44 下午
 * @Version 1.0
 **/
public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        Season a = Season.AUTUMN;
        switch (a){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
        }
    }
}

enum  Season{
    SPRING, SUMMER, AUTUMN, WINTER
}

