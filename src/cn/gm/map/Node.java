package cn.gm.map;

/**
 * @ClassName Node
 * @Description 节点Node
 * @Author edz
 * @Date 2021/5/11 3:48 下午
 * @Version 1.0
 **/
public class Node<K, V> {
    int hash;
    K key;
    V value;
    Node<K, V> next;
}
