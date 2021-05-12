package cn.gm.map;

import java.util.*;

/**
 * @ClassName TestStoreData
 * @Description 测试表格数据存储, 每一行使用javabean对象，多行使用放到map/List
 * @Author edz
 * @Date 2021/5/11 6:02 下午
 * @Version 1.0
 **/

public class TestStoreData {
    public static void main(String[] args) {
//        testStoreData0();
        User user1 = new User(1001, "张三", 20000, "2018.5.5");
        User user2 = new User(1002, "李四", 30000, "2019.5.4");
        User user3 = new User(1003, "王五", 3000, "2020.5.4");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        for(User u:list){
            System.out.println(u);
        }

        Map<Integer, User> map = new HashMap<>();
        map.put(1001, user1);
        map.put(1002, user2);
        map.put(1003, user3);
        Set<Integer> keySet = map.keySet();
        for(Integer key:keySet){
            System.out.println(key+"======" + map.get(key));
        }
    }

    public static void testStoreData0(){
        //第一种方式
        Map<String, Object> row1 = new HashMap();
        row1.put("id", 1001);
        row1.put("姓名", "张三");
        row1.put("薪水", 20000);
        row1.put("入职日期", "2018.5.5");

        Map<String, Object> row2 = new HashMap();
        row2.put("id", 1002);
        row2.put("姓名", "李四");
        row2.put("薪水", 30000);
        row2.put("入职日期", "2019.5.4");

        Map<String, Object> row3 = new HashMap();
        row3.put("id", 1003);
        row3.put("姓名", "王五");
        row3.put("薪水", 3000);
        row3.put("入职日期", "2020.5.4");

        List<Map<String, Object>> table = new ArrayList<>();
        table.add(row1);
        table.add(row2);
        table.add(row3);

        for(Map<String, Object> row:table){
            Set<String> keySet = row.keySet();
            for(String key:keySet){
                System.out.print(key+":" + row.get(key));
            }
            System.out.println();
        }
    }
}


class User{
    private int id;
    private String name;
    private double salary;
    private String hiredate;

    public User() {
    }

    public User(int id, String name, double salary, String hiredate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString(){
        return "id:" + id + ",name:" + name + ", salary"+ salary;
    }
}