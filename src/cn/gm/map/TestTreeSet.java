package cn.gm.map;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName TestTreeSet
 * @Description Treeset,底层用TreeMap
 * @Author edz
 * @Date 2021/5/11 5:31 下午
 * @Version 1.0
 **/
public class TestTreeSet {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet();
        treeSet.add(1111);
        treeSet.add(2222);
        treeSet.add(2222);
        for(Integer m:treeSet){
            System.out.println(m); // 1111, 2222
        }
    }
}
