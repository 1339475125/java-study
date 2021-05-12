package cn.gm.oop;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TestMap
 * @Description 测试HashMap,键不重复（equals），重复则会被覆盖
 * @Author edz
 * @Date 2021/5/11 2:52 下午
 * @Version 1.0
 **/
public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap();
        m1.put(1, "one"); //存储
        m1.put(2, "two");
        m1.put(3, "three");

        System.out.println(m1.get(1)); // 获取 one
        System.out.println(m1.size()); // 3
        System.out.println(m1.isEmpty());  // false
        System.out.println(m1.containsKey(2)); //true
        System.out.println(m1.containsValue("one")); //true

        Map<Integer, String> m2 = new HashMap<>();
        m2.put(4, "四");
        m2.put(5, "五");
        m1.putAll(m2);
        System.out.println(m1); //{1=one, 2=two, 3=three, 4=四, 5=五}
    }
}
