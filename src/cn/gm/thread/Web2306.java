package cn.gm.thread;

/**
 * @ClassName Web2306
 * @Description 并发需要保证线程安全
 * @Author edz
 * @Date 2021/5/12 3:34 下午
 * @Version 1.0
 **/
public class Web2306 implements Runnable{
    private int ticketNums = 99;

    @Override
    public void run(){
        while(true){
            if(ticketNums<0){
                break;

            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "========"+ ticketNums--);
            // q3er========0
            //小子========-1
            //码农========-2
        }
    }

    public static void main(String[] args) {
        // 一份资源
        Web2306 web = new Web2306();
        // 多个代理
        new Thread(web, "码农").start();
        new Thread(web, "小子").start();
        new Thread(web, "q3er").start();
    }
}
