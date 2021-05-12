package cn.gm.oop;

import java.util.Arrays;

/**
 * @ClassName TestArrays
 * @Description 测试java.util.Arrays
 * @Author edz
 * @Date 2021/5/10 11:27 上午
 * @Version 1.0
 **/
public class TestArrays {
    public static void main(String[] args) {
        int[] a = {100,20, 30, 50, 5,40};
        System.out.println();

        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println(a);

        System.out.println(Arrays.binarySearch(a, 30));
    }
}
