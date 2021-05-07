/**
 * @ClassName User2
 * @Description 测试static关键字的用法
 * @Author edz
 * @Date 2021/4/30 4:37 下午
 * @Version 1.0
 **/
public class User2 {
    int id;
    String name;
    String pwd;

    static String company = "北京尚学堂";

    public User2(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void  login(){
        System.out.println("登录： " + name);
    }

    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {
        User2 u = new User2(101, "高小齐");
        User2.printCompany();
        User2.company = "北京阿里爷爷";
        User2.printCompany();
    }
}
