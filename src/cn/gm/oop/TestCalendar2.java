package cn.gm.oop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @ClassName TestCalendar2
 * @Description 可视化日历程序
 * @Author edz
 * @Date 2021/5/10 4:10 下午
 * @Version 1.0
 **/
public class TestCalendar2 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入日期（格式： 2020-10-10）：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(str);

        Calendar c = new GregorianCalendar();
        c.setTime(date);
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        int day = c.get(Calendar.DAY_OF_MONTH);
        int days = c.getActualMaximum(Calendar.DATE);

        c.set(Calendar.DAY_OF_MONTH, 1);
        for(int i=0; i<c.get(Calendar.DAY_OF_WEEK)-1; i++){
            System.out.print("\t");
        }
        for(int i=1; i<=days; i++){
            if(day==c.get(Calendar.DAY_OF_MONTH)){
                System.out.print(c.get(Calendar.DAY_OF_MONTH) + "*\t");
            } else{
                System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
            }

            if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
                System.out.println();
            }
            c.add(Calendar.DAY_OF_MONTH, 1);
        }

    }
}
