package cn.gm.thread;

/**
 * @ClassName Racer
 * @Description 实现龟兔赛跑多线程
 * @Author edz
 * @Date 2021/5/12 3:42 下午
 * @Version 1.0
 **/
public class Racer implements Runnable{

    private  static String winner;

    @Override
    public void run(){
        for(int steps=1; steps<=100; steps++){
            // 模拟休息
            if(Thread.currentThread().getName().equals("rabbit")){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() +"-->" + steps);
            boolean flag = gameOver(steps);
            if(flag){
                break;
            }
        }
    }

    private boolean gameOver(int steps){
        if(winner!=null){
            return true;
        } else{
            if(steps==100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner: " + winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Racer racer = new Racer();
        new Thread(racer, "rabbit").start();
        new Thread(racer, "tortoise").start();
    }
}
