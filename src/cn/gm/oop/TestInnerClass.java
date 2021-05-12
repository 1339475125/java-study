package cn.gm.oop;

/**
 * @ClassName TestInnerClass
 * @Description 测试非静态内部类,生成独立的class文件，可以直接访问外部内的属性
 * @Author edz
 * @Date 2021/5/7 3:21 下午
 * @Version 1.0
 **/

public class TestInnerClass {
    public static void main(String[] args) {
        // 创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}


class Outer{
    private int age = 10;

    public void testOuter(){
        System.out.println("Outer.testOuter()");
    }

    class Inner{
        int age = 20;
        public void show(){
            age = 30;
            System.out.println("外部内的成员变量age:" + Outer.this.age);
            System.out.println("内部类的成员变量age:" + this.age);
            System.out.println("局部变量age:" + age);
        }
    }
}