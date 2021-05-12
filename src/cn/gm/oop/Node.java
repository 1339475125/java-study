package cn.gm.oop;

/**
 * @ClassName Node
 * @Description 节点
 * @Author edz
 * @Date 2021/5/11 10:57 上午
 * @Version 1.0
 **/

public class Node {
    Node previous; //上一个节点
    Node next;  // 下一个节点
    Object element; //元素数据

    public Node(Node previous, Node next, Object element) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public Node(Object element) {
        this.element = element;
    }

}


