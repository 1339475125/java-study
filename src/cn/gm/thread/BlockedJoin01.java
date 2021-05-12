package cn.gm.thread;

/**
 * @ClassName BlockedJoin01
 * @Description join合并线程，插队线程
 * @Author edz
 * @Date 2021/5/12 5:44 下午
 * @Version 1.0
 **/
public class BlockedJoin01 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            for(int i=0; i<100; i++){
                System.out.println("lambda...." +i);
            }
        });
        t.start();

        for(int i=0; i<100; i++){
            if(i%20==0){
                t.join(); // 插队, main阻塞，此时先让lambda先走，再main走
            }
            System.out.println("main......" + );
        }
    }
}
