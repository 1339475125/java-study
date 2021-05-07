/**
 * @ClassName User4
 * @Description 测试参数值传递
 * @Author edz
 * @Date 2021/4/30 5:23 下午
 * @Version 1.0
 **/
public class User4 {
    int id;
    String name;
    String pwd;

    public User4(int id, String name){
        this.id = id;
        this.name= name;
    }

    public  void testParameterTransfer01(User4 u){
        u.name = "高小八";
    }

    public void testParameterTransfer02(User4 u){
        u = new User4(200, "高小");
    }

    public static void main(String[] args) {
        User4 u1 = new User4(100, "高小七");
        u1.testParameterTransfer01(u1); //高小八
        System.out.println(u1.name);

        u1.testParameterTransfer02(u1);  //高小八
        System.out.println(u1.name);
    }
}
