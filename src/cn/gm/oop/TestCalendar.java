package cn.gm.oop;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @ClassName TestCalendar
 * @Description 测试日历类
 * @Author edz
 * @Date 2021/5/10 3:54 下午
 * @Version 1.0
 **/
public class TestCalendar {
    public static void main(String[] args) {
        // 获取相关的元素
        Calendar cal = new GregorianCalendar(2999, 10, 9, 22, 10, 50);
        System.out.println(cal); //java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2999,MONTH=10,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=9,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=10,SECOND=50,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]
        int year = cal.get(Calendar.YEAR); //年份
        int day = cal.get(Calendar.DATE); // DAY_OF_MONTH
        int month = cal.get(Calendar.MONTH); // 0-11对应的1-12月月份
        int weekday = cal.get(Calendar.DAY_OF_WEEK); // 1-7 星期日开始
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(weekday);

        //设置日期的相关元素
        Calendar cal1 = new GregorianCalendar();
        cal1.set(Calendar.YEAR, 8012);
        System.out.println(cal1);

        //日期的计算
        Calendar cal2 = new GregorianCalendar();
        cal2.add(Calendar.DATE, 100); //往后100天
        System.out.println(cal2);

        //日期对象和时间对象的转换
        Date d4 = cal2.getTime();
        Calendar c4 = new GregorianCalendar();
        c4.setTime(new Date());
        printCalendar(c4); // 2021年4月10日 4:9:15 周1

    }

    public static  void printCalendar(Calendar c){
        // 打印： 1918年10月10日 11：23：45 周三
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        int weekday = c.get(Calendar.DAY_OF_WEEK) -1;
        String dayweek2 = weekday==0?"日":weekday + "";

        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        System.out.println(year + "年" + month + "月" + day + "日"+ " " + hour + ":" + minute + ":" + second + " " + "周" + dayweek2);

    }
}
