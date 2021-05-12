package cn.gm.oop;

/**
 * @ClassName TestMakeexception
 * @Description 测试手动生成异常
 * @Author edz
 * @Date 2021/5/10 5:20 下午
 * @Version 1.0
 **/
public class TestMakeexception {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-10);
    }
}

class Person{
    private int age;

    public int getAge(){
        return  age;
    }
    public void setAge(int age){
        if(age <0){
            throw new IllegalAgeException("年龄不能为负数");
        }
        this.age = age;
    }
}
class IllegalAgeException extends RuntimeException{
    public IllegalAgeException(){

    }
    public  IllegalAgeException(String msg){
        super(msg);
    }
}