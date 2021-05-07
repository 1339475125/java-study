/**
 * @ClassName User3
 * @Description 静态初始化块的作用
 * @Author edz
 * @Date 2021/4/30 4:45 下午
 * @Version 1.0
 **/
public class User3 {
    int id;
    String name;
    String pwd;
    static  String company;

    // 先加载类，在构造函数
    static {
        System.out.println("执行类的初始化工作");
        company = "北京尚学堂";
        printCompany();
    }
    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {
        User3 u3 = null;
    }
}
