package cn.gm.oo;

/**
 * @ClassName TestPolym
 * @Description 测试多态
 * @Author edz
 * @Date 2021/5/6 2:44 下午
 * @Version 1.0
 **/
public class TestPolym {
    public static void main(String[] args) {
        Animal a = new Animal();
        animalCry(a);
        Animal d = new Dog(); //自动向上转型
        animalCry(new Cat());
        Dog d2 = (Dog) d; //强制向下转型
    }

    static  void animalCry(Animal a){
        a.shout();
    }
}

class Animal{
    public final void shout(){
        System.out.println("叫了一声");
    }
}

class Dog extends Animal{
    // 继承、重写
    public void shout(){
        System.out.println("旺旺旺");
    } //加了final报错，不能被继承，不能重写
}

class Cat extends  Animal{
    public void shout(){
        System.out.println("喵喵");
    }
}