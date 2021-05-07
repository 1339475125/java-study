package cn.gm.oo2;

/**
 * @ClassName TestExtends
 * @Description 测试继承
 * @Author edz
 * @Date 2021/4/30 5:50 下午
 * @Version 1.0
 **/
public class TestExtends {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "高小八";
        stu.height = 180;
        stu.rest();

        Student stu2 = new Student("xixi", 162, "挖掘机");
        System.out.println( stu2 instanceof Student);
    }
}

class Person{;
    String name;
    int height;

    public void rest(){
        System.out.println("休息一会");
    }
}

class Student extends Person{
    String major;

    public  void  study(){
        System.out.println("学习两小时");
    }

    public Student(String name, int height, String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }

    public Student(){

    }
}