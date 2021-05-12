package cn.gm.oop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName TestFileRead
 * @Description 测试异常处理
 * @Author edz
 * @Date 2021/5/10 5:09 下午
 * @Version 1.0
 **/
public class TestFileRead {
    public static void main(String[] args) throws IOException {
        readMyFile();
    }

    public static void readMyFile() throws IOException {
        FileReader reader = new FileReader("/data/log.txt");
        char c1 = (char) reader.read();
    }
}
