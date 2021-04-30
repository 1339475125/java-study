/**
 * @ClassName TestSwitch
 * @Description 测试switch
 * @Author edz
 * @Date 2021/4/29 7:25 下午
 * @Version 1.0
 **/
public class TestSwitch {
    public static void main(String[] args) {
        int month = (int)(1 + 12 * Math.random());
        switch (month){
            case 1:
                System.out.println("一月份, 过新年了");
                break; // 不写直接到下一个break
            case 2:
                System.out.println("二月份，开春了");
                break;
            default:
                System.out.println("其他月份");
                break;
        }
    }
}
