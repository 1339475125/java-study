package cn.gm.oo2;

/**
 * @ClassName TestObject
 * @Description TODO
 * @Author edz
 * @Date 2021/5/6 10:29 上午
 * @Version 1.0
 **/
public class TestObject {
    public static void main(String[] args) {

//        Object obj;
        TestObject to = new TestObject();
        System.out.println(to.toString());
        Person2 p2 = new Person2("希希", 6);
        System.out.println(p2.toString());
    }
    public  String toString(){
        return "测试Object对象"; //重写
    }

}

class Person2{
    String name;
    int age;

    @Override
    public String toString(){
        return name + "年龄：" +age;
    }

    public  Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
}