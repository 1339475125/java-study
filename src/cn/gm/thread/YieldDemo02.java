package cn.gm.thread;

/**
 * @ClassName YieldDemo02
 * @Description 礼让，也是让线程暂停，避免cpu占用过长时间
 * @Author edz
 * @Date 2021/5/12 5:31 下午
 * @Version 1.0
 **/
public class YieldDemo02 {
    public static void main(String[] args) {
        new Thread(()->{
            for(int i=0; i<100; i++){
                System.out.println("lambda...." +i);
            }
        }).start();

        for(int i=0; i<100; i++){
            if(i%20==0){
                Thread.yield(); // main礼让
            }
            System.out.println("main......");
        }
    }

}
