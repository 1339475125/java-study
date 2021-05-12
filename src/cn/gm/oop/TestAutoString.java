package cn.gm.oop;

/**
 * @ClassName TestAutoString
 * @Description 测试String源码, 测试StringBuilder、StringBuffer可变字符序列
 * @Author edz
 * @Date 2021/5/10 3:09 下午
 * @Version 1.0
 **/
public class TestAutoString {
    public static void main(String[] args) {
        //不可变
        String  str = "adfafwf";
        // 编译器做了优化直接在编译的时候讲字符串进行拼接
        String str1 = "hello" + " java";
        String str2 = "hello java";
        System.out.println(str1==str2); // true
        String str3 = "hello";
        String str4 = " java";
        String  str5 = str3 + str4;
        System.out.println(str2 == str5); // false
        // StringBuilder线程不安全，效率高（一般使用它）
        // StringBuffer线程安全，效率低
        StringBuilder sb = new StringBuilder("abbbffwf");
        System.out.println(Integer.toHexString(sb.hashCode())); // 448139f0
        System.out.println(sb); // abbbffwf

        sb.setCharAt(2, 'M');
        System.out.println(Integer.toHexString(sb.hashCode()));  // 448139f0
        System.out.println(sb);  //abMbffwf

        StringBuilder eb = new StringBuilder();
        for(int i=0;i<26; i++){
            char temp = (char) ('a' +i);
            eb.append(temp);
        }
        System.out.println(eb); // abcdefghijklmnopqrstuvwxyz
        eb.reverse();
        System.out.println(eb); // zyxwvutsrqponmlkjihgfedcba
        eb.setCharAt(3, 'g');
        System.out.println(eb); // zyxgvutsrqponmlkjihgfedcba
        eb.insert(0, '我').insert(6, 'a').insert(7, 'n');
        System.out.println(eb); // 我zyxgvanutsrqponmlkjihgfedcba

        eb.delete(20, 23);
        System.out.println(eb); //我zyxgvanutsrqponmlkjfedcba


        // 循环累加一定不能用这个
        String str8 = "";
        for(int i=0; i<5000; i++){ //不可出现  占用内存：12406960 时间：59
            str8 = str8 + i;
        }
        System.out.println(str8);

        //替换上面的方法用StringBuilder
        StringBuilder sb1 = new StringBuilder("");
        for(int i=0; i<5000; i++){ //出现 占用内存：0 时间：1
            sb1.append(i);
        }

    }
}
