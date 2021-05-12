package cn.gm.oop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName TestDateFormat
 * @Description 测试DateFromat 和SimpleDateFormat
 * @Author edz
 * @Date 2021/5/10 3:43 下午
 * @Version 1.0
 **/
public class TestDateFormat {
    public static void main(String[] args) throws ParseException {

        // 把时间对象按照"格式字符串指定的格式" 转成相应的字符串
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = df.format(new Date(4000000));
        System.out.println(str); // 1970-01-01 09:06:40

        // 把字符串按照"格式字符串指定的格式" 转成相应的时间对象
        DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        Date  date = df2.parse("1983年5月10日 14时22分11秒");
        System.out.println(date); // Tue May 10 14:22:11 CST 1983

        //测试其他的格式字符串,当前所处年份的第多少天
        DateFormat df3 = new SimpleDateFormat("D");
        String str1 = df3.format(new Date());
        System.out.println(str1); // 130
    }
}
