package cn.gm.oop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @ClassName TestList
 * @Description 测试容器中的list
 * @Author edz
 * @Date 2021/5/10 6:06 下午
 * @Version 1.0
 **/
public class TestList {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.add("13141");
        c.add("qqfqf");
        System.out.println(c);
        c.remove("qqfqf"); // 移除，不是删除，对象还在，只是不在容器中了

        System.out.println(c.toArray());

        System.out.println(c.contains("wefwt"));

        c.clear();
        System.out.println(c);
    }
}
