package cn.gm.oop;

/**
 * @ClassName TestArrayCopy
 * @Description 测试数组拷贝
 * @Author edz
 * @Date 2021/5/8 11:22 上午
 * @Version 1.0
 **/
public class TestArrayCopy {
    public static void main(String[] args) {
        String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
        String[] s2 = new String[10];
        System.arraycopy(s1, 2, s2, 6,3);
        for(int i=0; i<s2.length; i++){
            System.out.println(i+"__"+s2[i]);
        }
    }


}
