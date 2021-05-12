package cn.gm.map;

import java.util.TreeMap;

/**
 * @ClassName GmHashMap
 * @Description 自定义一个HashMap
 * @Author edz
 * @Date 2021/5/11 3:47 下午
 * @Version 1.0
 **/
public class GmHashMap<K, V> {  //泛型
    Node<K,V>[] table; //位桶数组，bucket array
    int size;    // 存放的键值对的个数

    public GmHashMap(){
        table = new Node[16]; //长度为2的整数幂
    }

    public void put(K key, V value){
        Node newNode = new Node();
        newNode.hash = myHash(key.hashCode(), table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        Node temp = table[newNode.hash];
        Node iterLast = null;
        boolean keyRpeat = false;
        if(temp==null){
            // 如果为空，则直接将新节点放进去
            table[newNode.hash] = newNode;
            size++;
        } else{
            //增加到链表里面去
            while(temp!=null){
                // 判断key如果重复，则覆盖
                if(temp.key.equals(key)){
                    keyRpeat = true;
                    temp.value = value; // 只是覆盖value值，其他不变
                    System.out.println("key重复了！");
                    break;
                } else{
                    // key 不重复, 则遍历下一个
                    iterLast = temp;
                    temp = temp.next;
                }
            }
            if(!keyRpeat){ //如果没有发生重复的情况下则加入到链表里面
                iterLast.next = newNode;
                size++;
            }
        }
    }

    public static int myHash(int v, int length){
//        System.out.println("取模运算" + (v%(length-1))); // 取模运算，效率低 10/5/0
//        System.out.println("位运算" + (v&(length-1)));  // 直接位运算，效率高 10/4/14
        return v&(length-1);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for(int i=0; i< table.length; i++){
            Node temp = table[i];
            while(temp!=null){
                sb.append(temp.key+":"+temp.value+",");
                temp = temp.next;
            }
        }
        sb.setCharAt(sb.length()-1, '}');
        return sb.toString();
    }

    public V get(K key){
        int hash = myHash(key.hashCode(), table.length);
        V value = null;
        if(table[hash]!=null){
            Node temp = table[hash];
            while(temp!=null){
                if(temp.key.equals(key)){
                    value = (V)temp.value;
                    break;
                }else{
                    temp = temp.next;
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        GmHashMap m = new GmHashMap();
        m.put(10, "aa");
        m.put(20, "bb");
        m.put(30, "cc");
        System.out.println(m.toString()); // {20:bb,10:aa,30:cc}
        m.put(10, "ssss"); //覆盖
        System.out.println(m.toString()); // {20:bb,10:ssss,30:cc}
        m.put(53, "ffdfsf");
        m.put(69, "efwfwf");
        System.out.println(m.toString()); // {20:bb,53:ffdfsf,10:ssss,30:cc}

        System.out.println(m.get(53)); //ffdfsf
    }
}
