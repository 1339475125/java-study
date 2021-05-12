package cn.gm.oop;

/**
 * @ClassName TestInterface
 * @Description 测试接口类实现
 * @Author edz
 * @Date 2021/5/7 2:59 下午
 * @Version 1.0
 **/


public class TestInterface {
    public static void main(String[] args) {
        Volant v = new Angel();
        v.fly();
        Angel x = new Angel();
        x.helpOther();
    }
}

/**
 * 飞行接口
 */
interface Volant{
    int FLY_HEIGHT = 1000;
    void fly();
}

interface Honest{
    void helpOther();
}

class Angel implements Volant, Honest{ //多个父接口
    @Override
    public void fly() {
        System.out.println("飞");
    }

    @Override
    public void helpOther() {
        System.out.println("帮助");
    }
}

class GoodMan implements Honest{
    @Override
    public void helpOther() {
        System.out.println("GoodMan.helpOther()");
    }
}

class Birdman implements Volant{
    @Override
    public void fly() {
        System.out.println("Birdman.fly()");
    }
}