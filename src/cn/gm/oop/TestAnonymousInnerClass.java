package cn.gm.oop;

/**
 * @ClassName TestAnonymousInnerClass
 * @Description 测试匿名内部类
 * @Author edz
 * @Date 2021/5/7 3:45 下午
 * @Version 1.0
 **/
public class TestAnonymousInnerClass {
    public static void  test01(AA a){
        a.aa();
    }

    public static void main(String[] args) {
        TestAnonymousInnerClass.test01(new AA(){
            @Override
            public void aa() {
                System.out.println("TestAnonymousInnerClass.aa()");
            }
        });
    }
}

interface AA{
    void aa();
}
