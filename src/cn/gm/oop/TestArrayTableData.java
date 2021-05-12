package cn.gm.oop;

import java.util.Arrays;

/**
 * @ClassName TestArrayTableData
 * @Description TODO
 * @Author edz
 * @Date 2021/5/10 11:41 上午
 * @Version 1.0
 **/
public class TestArrayTableData {
    public static void main(String[] args) {
        Object[] emp1 = {1001, "ewfewf", 18, "将是", "2020.3.3"};
        Object[] emp2 = {1002, "ewfewf", 18, "将是", "2020.3.3"};
        Object[] emp3 = {1003, "ewfewf", 18, "将是", "2020.3.3"};

        Object[][] tableData = new Object[3][];
        tableData[0] = emp1;
        tableData[1] = emp2;
        tableData[2] = emp3;

        for(Object[] temp:tableData){
            System.out.println(Arrays.toString(temp));
        }
    }
}
