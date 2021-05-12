package cn.gm.thread;

/**
 * @ClassName TestThread
 * @Description 测试线程 创建线程方式一 1、创建：继承Thread + 重写 方式2：
 * @Author edz
 * @Date 2021/5/12 2:23 下午
 * @Version 1.0
 **/
public class TestThread extends Thread {
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
        //创建子类对象
        TestThread st = new TestThread();
        // 方法一
        st.start(); // 两条路掺杂着来 听歌-coding-conding-听歌。。。 不保证立即运行由cpu确认
        // st.run(); //只是普通方法调用 听歌--coding

        for(int i=0; i<20; i++){
            System.out.println("一边coding");
        }

    }
}
