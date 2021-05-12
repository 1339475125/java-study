package cn.gm.oop;

/**
 * @ClassName TestAutoBox
 * @Description 自动装箱
 * @Author edz
 * @Date 2021/5/10 2:56 下午
 * @Version 1.0
 **/
public class TestAutoBox {
    public static void main(String[] args) {
        Integer a = 234; //自动装箱
        int b =a; //自动拆箱：编译器自动改成 int b = a.intValue();

        Integer c = null;
        if(c!=null){
            int d = c;
        }
        // 缓存[-127, 128]之间的数字，实际就是创建的时候，创建了[-127, 128]之间的一个缓存机制
        // 若valueOf创建值的时候再这个范围直接从这个缓存中取值
        // 否则创建新的Integer对象
        Integer int1 = Integer.valueOf(-128);
        Integer int2 = Integer.valueOf(-128);
        System.out.println(int1 == int2);// true 因为123在缓存范围之类
        System.out.println(int1.equals(int2)); // true

        Integer int3 = Integer.valueOf(12455);
        Integer int4 = Integer.valueOf(12455);
        System.out.println(int3 == int4); // false 因为不在缓存范围之类
        System.out.println(int3.equals(int4));// true
    }
}
