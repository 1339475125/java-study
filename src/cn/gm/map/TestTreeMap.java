package cn.gm.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName TestTreeMap
 * @Description 测试TreeMap的用法
 * @Author edz
 * @Date 2021/5/11 4:48 下午
 * @Version 1.0
 **/
public class TestTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> treemap1 = new TreeMap<>();
        treemap1.put(20, "aa");
        treemap1.put(3, "bb");
        treemap1.put(40, "cc");
        //按照key递增的方式排序
        for(Integer key:treemap1.keySet()){
            System.out.println(key+"---"+treemap1.get(key)); // 3---bb, 20---aa, 40---cc
        }
        Map<Emp, String> treemap2 = new TreeMap<>();
        treemap2.put(new Emp(100, "张三", 50000), "是个好人");
        treemap2.put(new Emp(200, "李四", 10000), "不积极");
        treemap2.put(new Emp(300, "王五", 30000), "不错");
        treemap2.put(new Emp(400, "拉里", 10000), "不错");

        for(Emp key:treemap2.keySet()){
            System.out.println(key+"---"+treemap2.get(key)); // 3---bb, 20---aa, 40---cc
        } /**id: 200name:李四salary:10000.0---不积极
         id: 400name:拉里salary:10000.0---不错
         id: 300name:王五salary:30000.0---不错
         id: 100name:张三salary:50000.0---是个好人
         */
    }

}

class Emp implements Comparable<Emp>{
    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Emp o) { //负数：小于， 0：等于， 正数：大于
        if(this.salary > o.salary){
            return 1;
        } else if(this.salary < o.salary){
            return -1;
        } else{
            if(this.id>o.id){
                return 1;
            } else{
                return 0;
            }
        }
    }

    @Override
    public  String toString(){
        return "id: "+id +"name:"+name +"salary:" + salary;
    }
}
