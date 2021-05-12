package cn.gm.oop;

import java.util.Date;

/**
 * @ClassName TestDate
 * @Description 测试Date的常见方法
 * @Author edz
 * @Date 2021/5/10 3:37 下午
 * @Version 1.0
 **/
public class TestDate {
    public static void main(String[] args) {
        Date d = new Date(); //Date d = new Date(2000);
        System.out.println(d);

        System.out.println(d.getTime());
        Date d2 = new Date();
        System.out.println(d2.getTime());
        System.out.println(d2.after(d));

        //以后用Calendar处理
        Date d3 = new Date(2020-1900, 3,10); //2020年4月10日
        System.out.println(d3);
    }
}
