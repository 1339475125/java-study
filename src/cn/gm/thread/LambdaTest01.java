package cn.gm.thread;

/**
 * @ClassName LambdaTest01
 * @Description lambda推到
 * @Author edz
 * @Date 2021/5/12 4:30 下午
 * @Version 1.0
 **/
public class LambdaTest01 {

    //静态内部类
    static class Like2 implements Ilike{
        @Override
        public void lambda() {
            System.out.println("i like lambda2");
        }
    }

    public static void main(String[] args) {
        Ilike like = new Like();
        like.lambda();

        Ilike like2 = new Like2();
        like2.lambda();

        // 匿名内部类
        like = new Ilike() {
            @Override
            public void lambda() {
                System.out.println("i like lambda3");
            }
        };

        // lamdba推导式
        like = ()->{
            System.out.println("i like lambda4");
        };
    }

}


interface  Ilike{
    void lambda();
}

// 外部类
class Like implements Ilike{
    @Override
    public void lambda() {
        System.out.println("i like lambda1");
    }
}