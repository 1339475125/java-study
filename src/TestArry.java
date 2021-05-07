/**
 * @ClassName TestArry
 * @Description 测试数组
 * @Author edz
 * @Date 2021/5/6 3:31 下午
 * @Version 1.0
 **/
public class TestArry {
    public static void main(String[] args) {
        int[] arr01 = new int[10];
        String[] arr02 = new String[5];
        arr01[0] = 13;
        arr01[1] = 15;
        arr01[2] = 20;
        for(int i=0; i<arr01.length; i++){
            arr01[i] = 10 *i;
        }
        for(int i=0; i<arr01.length; i++){
            System.out.println(arr01[i]);
        }

        User05[] arr03 = new User05[3];  //初始化，默认值, 引用类型
        arr03[0] = new User05(100, "vdsv");
        arr03[1] = new User05(101, "fwfewf");
        arr03[2] = new User05(102, "ffew");

        for(int i=0; i<arr03.length; i++){
            System.out.println(arr03[i].getName());
        }
    }
}

class User05{
    private int id;
    private String name;

    public User05(int id, String name) {
        super();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
