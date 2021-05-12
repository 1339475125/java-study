package cn.gm.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @ClassName WebDownloder
 * @Description 多线程下载图片
 * @Author edz
 * @Date 2021/5/12 2:38 下午
 * @Version 1.0
 **/
public class WebDownloder {
    public static void main(String[] args) {

    }
    public void download(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            System.out.println("url不合法");
            e.printStackTrace();
        }
    }
}
