/**
 * @ClassName TestStuClass
 * @Description 测试类
 * @Author edz
 * @Date 2021/4/30 2:36 下午
 * @Version 1.0
 **/
public class TestStuClass {
    // 属性，成员变量
    int id;
    String name;
    int age;
    Computer comp; //电脑品牌

    // 方法
    void study(){
        System.out.println("我在学习,我得电脑是" + comp.brand);
    }

    void play(){
        System.out.println("我在玩游戏啊");
    }
    // 构造方法，用于创建这个类的对象，无参的构造方法可以由系统自动创建
    TestStuClass(){

    }

    // 程序入口
    public static void main(String[] args) {
        TestStuClass stu = new TestStuClass(); //创建一个对象
        stu.id = 1001;
        stu.name = "werww";
        stu.age = 18;
        Computer c1 = new Computer();
        c1.brand = "mac";
        stu.comp = c1;
        stu.play();
        stu.study();
    }

}

class Computer{
    String brand;
}
