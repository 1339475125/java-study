package cn.gm.thread;

/**
 * @ClassName TerminateThread
 * @Description 终止线程
 * @Author edz
 * @Date 2021/5/12 4:54 下午
 * @Version 1.0
 **/
public class TerminateThread implements Runnable{
    // 加入标识，标记线程体是否可以运行
    private  boolean flag = true;
    private String name;

    public TerminateThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // 关联标识
        int i = 0;
        while(flag){
            System.out.println(name+"-->" + i++);
        }
    }

    // 对外提供方法
    public  void terminate(){
        this.flag = false;
    }

    public static void main(String[] args) {
        TerminateThread tt = new TerminateThread("c罗");
        new Thread(tt).start();
        for(int i=0; i<=99; i++){
            if(i==88){
                tt.terminate();
                System.out.println("tt game over");
            }
            System.out.println("main-->" +i);
        }
    }

}
