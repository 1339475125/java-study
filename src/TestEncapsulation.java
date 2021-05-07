/**
 * @ClassName TestEncapsulation
 * @Description 测试封装
 * @Author edz
 * @Date 2021/5/6 2:20 下午
 * @Version 1.0
 **/
public class TestEncapsulation {
    public static void main(String[] args) {
        Human h = new Human();
//        h.age = 13; //private 不可见
        h.name = "124"; //default 同一个包可用
        h.heignt = 23312;
    }
}

class Boy extends Human{
    void sayHello(){
//        System.out.println(age); //私有不可见
    }
}


class Girl extends  Human{
    void sayGood(){
        System.out.println(heignt); //被保护类可以使用
    }
}