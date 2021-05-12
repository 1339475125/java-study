package cn.gm.oop;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName TestFile
 * @Description 测试File基本用法
 * @Author edz
 * @Date 2021/5/10 4:30 下午
 * @Version 1.0
 **/
public class TestFile {
    public static void main(String[] args) throws IOException {
        File f = new File("/data/log/test.txt");
        f.renameTo(new File("/data/log/test1.txt"));

        System.out.println(System.getProperty("user.dir"));
        File f2 = new File("gg.txt");
        f2.createNewFile();
        System.out.println("file 是否存在： " + f2.exists());
        // mkdir 和mkdirs
        File f3 = new File("/data/log/124/1.txt");
        System.out.println(f3.mkdir());  // false
        File f4 = new File("/data/log/124/1.txt");
        System.out.println(f4.mkdirs()); //true

    }
}
