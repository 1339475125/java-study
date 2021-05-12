package cn.gm.oop;

import java.util.Arrays;

/**
 * @ClassName TestBinarySearch
 * @Description 折半检索（二分查找）
 * @Author edz
 * @Date 2021/5/10 2:14 下午
 * @Version 1.0
 **/
public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = {30, 40,20,10,1,50,7, 8,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(myBinarySearch(arr, 7));

    }

    public static int myBinarySearch(int[] arr, int value){
        int low = 0;
        int high = arr.length-1;
        while(low <=high){
            int mid = (low + high) / 2;
            if(value==arr[mid]){
                return mid;
            }
            if(value >arr[mid]){
                low = mid + 1;
            }
            if(value<arr[mid]){
                high = mid -1;
            }
        }
        return -1;
    }
}
