/**
 * @ClassName User
 * @Description 构造方法重载
 * @Author edz
 * @Date 2021/4/30 3:53 下午
 * @Version 1.0
 **/
public class User {
    int id;
    String name;
    String pwd;

    public User(){

    }

    public User(int id, String name){
        super(); //构造方法的第一句总是super()函数
        this.id = id; //this表示创建好的对象
        this.name = name;
    }

    public User(int id, String name, String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public static void main(String[] args){
        User u1 = new User();
        User u2 = new User(101, "起飞凤舞");
        User u3 = new User(100, "wfewfqf", "ewrwrwr");
    }
}
