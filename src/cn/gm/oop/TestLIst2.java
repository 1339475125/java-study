package cn.gm.oop;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestLIst2
 * @Description 测试容器中的集合方法
 * @Author edz
 * @Date 2021/5/10 6:14 下午
 * @Version 1.0
 **/
public class TestLIst2 {
    public static void main(String[] args) {
        test03();
    }

    public static void test01(){

    }

    public static void test02(){
        List<String> list01 = new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");
        System.out.println(list01); // [aa, bb, cc]

        List<String> list02 = new ArrayList<>();
        list02.add("aa");
        list02.add("dd");
        list02.add("ee");
        System.out.println(list02); //[aa, dd, ee]

        list01.addAll(list02);
        System.out.println(list01); // [aa, bb, cc, aa, dd, ee]

        list01.removeAll(list02);
        System.out.println(list01); //[bb, cc]

        System.out.println(list01.containsAll(list02)); // false
    }

    public static void test03(){
        List<String> list01 = new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");
        list01.add("B");
        System.out.println(list01); // [aa, bb, cc, B]
        list01.add(2, "我");
        System.out.println(list01); // [aa, bb, 我, cc, B]
        list01.remove(2);
        System.out.println(list01); // [aa, bb, cc, B]
        list01.set(2, "高耳");
        System.out.println(list01); //  [aa, bb, 高耳, B]
        System.out.println(list01.get(2));  // 高耳
        list01.add("B");
        System.out.println(list01.indexOf("B"));  // 3
        System.out.println(list01.lastIndexOf("B"));  // 4
    }
}
