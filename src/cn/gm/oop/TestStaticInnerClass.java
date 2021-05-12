package cn.gm.oop;

/**
 * @ClassName TestStaticInnerClass
 * @Description 测试静态内部类
 * @Author edz
 * @Date 2021/5/7 3:42 下午
 * @Version 1.0
 **/
public class TestStaticInnerClass {
    public static void main(String[] args) {
        Outer2.Inner2 inner = new Outer2.Inner2();
    }
}

class Outer2{
    static  class Inner2{

    }
}
