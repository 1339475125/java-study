package cn.gm.oo2;

/**
 * @ClassName TestEquals
 * @Description 测试equals
 * @Author edz
 * @Date 2021/5/6 10:40 上午
 * @Version 1.0
 **/
public class TestEquals {
    public static void main(String[] args) {
        Object obj; //equals 是否相同
        String str;
        User u1 = new User(1000, "", "");
        User u2 = new User(1000, "", "");
    }
}

class User{
    int age;
    String name;
    String pwd;

    public User(int age, String name, String pwd) {
        this.age = age;
        this.name = name;
        this.pwd = pwd;
    }
}
