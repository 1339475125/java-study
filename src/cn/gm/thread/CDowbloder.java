package cn.gm.thread;

import java.util.concurrent.*;

/**
 * @ClassName TDowbloder
 * @Description 方式三：Callable
 * @Author edz
 * @Date 2021/5/12 2:57 下午
 * @Version 1.0
 **/
public class CDowbloder implements Callable<Boolean> {
    private String url; //远程路径
    private String name; //存储名字

    public CDowbloder(String url, String name){
        this.url = url;
        this.name = name;
    }
    
    @Override
    public Boolean call() throws Exception{
       WebDownloder wd = new WebDownloder();
       wd.download(url, name);
       System.out.println(name);
       return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CDowbloder cd1 = new CDowbloder("https://gimg2.baidu.com/image_search/src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20170930%2F3c3741aefb1a449798a44f4e47410833.jpg&refer=http%3A%2F%2F5b0988e595225.cdn.sohucs.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1623395519&t=d590a6bfb1c2e971bebc7be9614f441c", "zls.jpg");
        CDowbloder cd2 = new CDowbloder("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.mw8.com%2F170621%2F1497552819.jpg&refer=http%3A%2F%2Fimg.mw8.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1623395448&t=1b0706524e1dcdc076e6588dfd6c7253", "xw.jpg");
        CDowbloder cd3 = new CDowbloder("https://img1.baidu.com/it/u=2902127007,2191767863&fm=26&fmt=auto&gp=0.jpg", "nj.jpg");
        // 线程的开启
        // 创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);

        // 提交执行
        Future<Boolean> result1 = ser.submit(cd1);
        Future<Boolean> result2 = ser.submit(cd2);
        Future<Boolean> result3 = ser.submit(cd3);

        // 获取结果
        boolean r1 = result1.get();
        boolean r2 = result2.get();
        boolean r3 = result3.get();

        // 关闭服务
        ser.shutdownNow();
    }
}
