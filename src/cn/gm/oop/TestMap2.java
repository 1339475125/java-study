package cn.gm.oop;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TestMap2
 * @Description 测试HashMap
 * @Author edz
 * @Date 2021/5/11 2:59 下午
 * @Version 1.0
 **/
public class TestMap2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "edz1", 5000);
        Employee e2 = new Employee(1002, "edz2", 4000);
        Employee e3 = new Employee(1003, "edz3", 3000);
        Employee e4 = new Employee(1001, "edz4", 2000);

        Map<Integer, Employee> map = new HashMap<>();
        map.put(1001, e1);
        map.put(1002, e2);
        map.put(1003, e3);
        map.put(1001, e4);

        Employee emp = map.get(1001);
        System.out.println(emp.getEname()); // edz4
        System.out.println(emp.toString()); // id:1001,ename:edz4,salary:2000.0
    }
}


class Employee{
    private int id;
    private  String ename;
    private double salary;

    public Employee(int id, String ename, double salary) {
        this.id = id;
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "id:" +id +","+ "ename:" + ename +","+ "salary:" + salary;
    }

    public int getId() {
        return id;
    }

    public String getEname() {
        return ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}