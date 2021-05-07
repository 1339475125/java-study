package cn.gm.oo;

/**
 * @ClassName Person4Encapsulation
 * @Description TODO
 * @Author edz
 * @Date 2021/5/6 2:31 下午
 * @Version 1.0
 **/
public class Person4Encapsulation {
    private int id;
    private String name;
    private  int age;
    private boolean man;

    public  void setName(String name){
        this.name = name;
    }

    public  void setAge(Integer age){
        if(age >= 1 && age <=130){
            this.age = age;
        }else{
            System.out.println("请输入正常的年龄");
        }
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public boolean isMan() {
        return man;
    }
}
