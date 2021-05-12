package cn.gm.map;

import java.util.*;

/**
 * @ClassName TestIterator
 * @Description 测试迭代器遍历LIST、set、Map
 * @Author edz
 * @Date 2021/5/11 5:36 下午
 * @Version 1.0
 **/
public class TestIterator {
    public static void main(String[] args) {
        testIteratorList();
        testIteratorSet();
        testIteratorMap();
    }

    public static void testIteratorList(){
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        // 使用迭代器遍历list
        for(Iterator<String> iter=list.iterator(); iter.hasNext();){
            String temp = iter.next();
            System.out.println(temp);
        }
    }

    public static void testIteratorSet(){
        Set<String> set = new HashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");
        // 使用迭代器遍历list
        for(Iterator<String> iter=set.iterator(); iter.hasNext();){
            String temp = iter.next();
            System.out.println(temp);
        }
    }

    public static void testIteratorMap(){
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "aa");
        map.put(200, "bb");
        map.put(300, "cc");

        // 第一种遍历方式
        Set<Map.Entry<Integer, String>> ss = map.entrySet();
        // 使用迭代器遍历map
        for(Iterator<Map.Entry<Integer, String>> iter = ss.iterator(); iter.hasNext();){
            Map.Entry<Integer, String> temp = iter.next();
            System.out.println(temp.getKey()+"---"+ temp.getValue());
        }

        System.out.println("##############");
        // 第二种遍历方式
        Set<Integer> keySet = map.keySet();
        for(Iterator<Integer> iter=keySet.iterator(); iter.hasNext();){
            Integer key = iter.next();
            System.out.println(key + "----" + map.get(key));
        }
    }
}
