package cn.gm.mycollection;

import java.lang.module.FindException;
import java.util.ArrayList;

/**
 * @ClassName SxtArrayList
 * @Description 自定义实现arraylist
 * @Author edz
 * @Date 2021/5/10 6:56 下午
 * @Version 1.0
 **/
public class SxtArrayList<E> {
    private  Object[] elementData;
    private  int size;
    private static final int DEFAULT_CAPACITY = 10;

    public SxtArrayList(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public SxtArrayList(int capacity){
        if(capacity<0){
            throw new RuntimeException("大小不能负数！");
        } else if (capacity==0){
            elementData = new Object[DEFAULT_CAPACITY];
        } else{
            elementData = new Object[capacity];
        }
    }

    public void add(E obj){ //泛型
        //什么时候扩容
        if(size==elementData.length){
            // 扩容
            Object[] newArray = new Object[elementData.length + (elementData.length>>1)];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);;
            elementData = newArray;
        }
        elementData[size++] = obj;

    }

    public E get(int index){
        checkRangeIndex(index);
        return (E) elementData[index];
    }

    public void set(E element, int index){
        //索引合法判断
        checkRangeIndex(index);
        elementData[index] = element;
    }

    public void checkRangeIndex(int index){
        if(index<0||index>size-1){
            throw  new RuntimeException("索引不合法: "+index);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i =0; i<size; i++) {
            sb.append(elementData[i] + ",");
        }
        sb.setCharAt(sb.length()-1, ']');
        return sb.toString();
    }

    public int size(){
        return size;
    }

    public  boolean isEmpty(){
        return size==0?true:false;
    }

    public void remove(E element){
        //移除对象
        for(int i=0; i<size; i++){
            if(element.equals(get(i))){//容器中的所有比较操作用equals
                remove(i);
            }
        }
    }

    public  void remove(int index){
        int numMoved = elementData.length - index - 1;
        if(numMoved>0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
    }

    public static void main(String[] args) {
        SxtArrayList s1 = new SxtArrayList(DEFAULT_CAPACITY);
//        s1.add("aa");
//        s1.add("bb");
        for(int i=0; i<10; i++){
            s1.add(i);
        }
        s1.get(9);
        System.out.println(s1); // [0,1,2,3,4,5,6,7,8,9]
        s1.set("cs", 2);
        System.out.println(s1); //[0,1,cs,3,4,5,6,7,8,9]
        s1.remove(3);
        System.out.println(s1); // [0,1,cs,4,5,6,7,8,9]
        s1.remove("cs"); //[0,1,4,5,6,7,8,9]
        System.out.println(s1);
        System.out.println(s1.size()); // 8
        System.out.println(s1.isEmpty()); //false
    }
}
