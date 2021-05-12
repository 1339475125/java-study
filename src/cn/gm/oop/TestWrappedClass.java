package cn.gm.oop;

/**
 * @ClassName TestWrappedClass
 * @Description 测试包装类
 * @Author edz
 * @Date 2021/5/10 2:48 下午
 * @Version 1.0
 **/
public class TestWrappedClass {
    public static void main(String[] args) {
        //转成包装对象
        Integer a = new Integer(3);
        Integer b = Integer.valueOf(30);

        //把包装对象转换成基本数据类型
        int c = b.intValue();
        double d = b.doubleValue();

        //把字符串转换成int
        Integer e = new Integer("999999");
        Integer f = Integer.parseInt("889999");

        // 把包装类对象转换成字符串
        String str = f.toString(); // "" +f

        //常见的常量
        System.out.println("int类型的最大的整数：" + Integer.MAX_VALUE);


    }
}
