package cn.gm.oop;

/**
 * @ClassName Test2DimenslonArrays
 * @Description 测试二维数组
 * @Author edz
 * @Date 2021/5/10 11:36 上午
 * @Version 1.0
 **/
public class Test2DimenslonArrays {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[]{20,30};
        a[1] = new int[]{10,15, 33};
        a[2] = new int[]{2,23};
        System.out.println(a[1][2]);

        //静态初始化二位数组
        int[][] b = {
                {20, 30},
                {10,15,33},
                {2,23}
        };
        System.out.println(a[1][2]);
    }
}
