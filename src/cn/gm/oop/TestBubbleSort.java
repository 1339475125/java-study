package cn.gm.oop;

import java.util.Arrays;

/**
 * @ClassName TestBubbleSort
 * @Description 测试冒泡排序
 * @Author edz
 * @Date 2021/5/10 11:47 上午
 * @Version 1.0
 **/
public class TestBubbleSort {
    public static void main(String[] args) {
        int[] values = {3, 1,6,2,9,0,7,4,5,8};
        for (int i =1; i<values.length-1; i++){
            boolean flag = true;
            for(int j =0; j<values.length -i; j++){
                //比较大小，换顺序
                if(values[j] > values[j+1]){
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                    flag = false;
                }
                System.out.println(Arrays.toString(values));
            }
            if(flag){
                System.out.println("结束");
                break;
            }
        }
    }
}
