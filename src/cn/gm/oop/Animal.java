package cn.gm.oop;

/**
 * @ClassName Animal
 * @Description 测试类抽象, 抽象的意义就在于：为子类提供统一的、规范的模板，子类必须实现相关的出现方法
 * @Author edz
 * @Date 2021/5/7 2:05 下午
 * @Version 1.0
 **/

public abstract  class Animal {
    abstract public  void shout();

    public void run(){
        System.out.println("跑啊跑!");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
    }
}



class Dog extends Animal{

    @Override
    public void shout(){
        System.out.println("汪汪");
    }
}