package cn.gm.thread;

/**
 * @ClassName StaticProxy
 * @Description 静态代理， 1、真实角色 2、代理角色
 * @Author edz
 * @Date 2021/5/12 4:18 下午
 * @Version 1.0
 **/
public class StaticProxy {
    public static void main(String[] args) {
        new WeddingConpany(new You()).happyMarry();
    }
}

interface  Marry{
    void happyMarry();
}

//真实角色
class You implements Marry{

    @Override
    public void happyMarry(){
        System.out.println("你和你对象");
    }
}

// 代理角色
class WeddingConpany implements Marry{
    // 真实角色
    private  Marry target;

    public WeddingConpany(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        ready();
        this.target.happyMarry();
        after();
    }

    private void ready(){
        System.out.println("准备");
    }

    private void after(){
        System.out.println("结束");
    }
}