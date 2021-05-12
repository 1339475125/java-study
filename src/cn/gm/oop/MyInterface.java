package cn.gm.oop;

/**
 * @ClassName MyInterface
 * @Description 测试接口， 接口可以多继承
 * @Author edz
 * @Date 2021/5/7 2:48 下午
 * @Version 1.0
 **/
public interface MyInterface {
    // 常量定义和抽象方法定义
    /*public  static final*/ int MAX_AGE =100;
    /*public abstract*/ void test01();
}

class MyClass implements MyInterface{
    @Override
    public void test01() {
        System.out.println(MAX_AGE);
        System.out.println("MyClass.test01()");
    }
}