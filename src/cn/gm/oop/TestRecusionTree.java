package cn.gm.oop;

import java.io.File;

/**
 * @ClassName TestRecusionTree
 * @Description 使用递归打印目录树
 * @Author edz
 * @Date 2021/5/10 4:38 下午
 * @Version 1.0
 **/
public class TestRecusionTree {
    public static void main(String[] args) {
        File f = new File("/data/log/gaia");
        printFile(f, 0);
    }

    static void  printFile(File file, int level){
        for(int i=0; i <level; i++){
            System.out.print("-");
        }
        System.out.println(file.getName());
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File temp: files){
                printFile(temp, level+1);
            }
        }
    }
}
