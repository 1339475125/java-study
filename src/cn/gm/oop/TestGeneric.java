package cn.gm.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TestGeneric
 * @Description 测试泛型, 泛型就是类型
 * @Author edz
 * @Date 2021/5/10 5:55 下午
 * @Version 1.0
 **/
public class TestGeneric {
    public static void main(String[] args) {
        MyCollection<String> mc = new MyCollection<String>();
        mc.set("gaiqo", 0);
//        mc.set(333, 1);

//        Integer a = (Integer) mc.get(1);
        String b =  mc.get(0);
        List list = new ArrayList();
        Map map = new HashMap();

    }
}

class MyCollection<E>{
    Object[] objs = new Object[5];

    public void set(Object obj, int index){
        objs[index] = obj;
    }

    public E get(int index){
        return (E) objs[index];
    }
}
