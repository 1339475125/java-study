/**
 * @ClassName TestThis
 * @Description 测试this
 * @Author edz
 * @Date 2021/4/30 4:21 下午
 * @Version 1.0
 **/
public class TestThis {
    int a, b ,c;

    TestThis(int a, int b){
        this.a = a;
        this.b = b;
    }
    TestThis(int a, int b, int c){
        this(a, b);
        this.c = c;
    }

    void sing(){}
    void eat(){
        this.sing();
        System.out.println("你妈妈喊你回家吃饭了");
    }
    public static void main(String[] args){
        TestThis hi = new TestThis(2, 3);
        hi.eat();
    }
}
