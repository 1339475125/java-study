package cn.gm.thread;

/**
 * @ClassName TestThread1
 * @Description 多线程实现Runable + 重写run方法 +
 * @Author edz
 * @Date 2021/5/12 3:26 下午
 * @Version 1.0
 **/
public class TestThread1 implements Runnable{

    /**
     *线程入口点
     */

    @Override
    public void run(){
        for(int i=0; i<20; i++) {
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
//        //创建子类对象
//        TestThread1 st = new TestThread1();
//        //方法二
//        Thread t = new Thread(st);
//        t.start();
        new Thread(new TestThread1()).start();
        for(int i=0; i<20; i++){
            System.out.println("一边洗澡");
        }

    }
}
