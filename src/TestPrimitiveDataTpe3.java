/**
 *@ClassName TestPrimitiveDataTpe3
 *@Description 测试字符类型
 *@Author edz
 *@Date 2021/4/29 3:36 下午
 *@Version 1.0
 **/
public class TestPrimitiveDataTpe3 {
    public static void main(String[] args) {
        char a = 'T';
        char b = '王';
        char c = '\u0061'; //Unicode 编码
        // 转移字符
        System.out.println('a' + 'b'); //195
        System.out.println("" + 'a' + 'b'); //ab
        System.out.println("" + "\'"+ 'a' + 'b' + "\'"); //'ab'
        // String 字符组成的队列
        String d = "abc";
        //测试布尔类型
        boolean man = true;
        if(man){
            System.out.println("男性");
        }
    }
}
