package cn.gm.thread;

/**
 * @ClassName YieldDemo
 * @Description 礼让线程yield, 直接进入就绪状态
 * @Author edz
 * @Date 2021/5/12 5:23 下午
 * @Version 1.0
 **/
public class YieldDemo {
    public static void main(String[] args) {
        MyYield my = new MyYield();
        new Thread(my, "a").start();
        new Thread(my, "b").start();
    }
}

class MyYield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-->start");
        Thread.yield(); //礼让线程
        System.out.println(Thread.currentThread().getName() + "-->end");
    }
}