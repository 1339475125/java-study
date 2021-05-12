package cn.gm.oop;

/**
 * @ClassName SxtLinkedList
 * @Description 手动实现LinkedList
 * @Author edz
 * @Date 2021/5/11 10:56 上午
 * @Version 1.0
 **/

public class SxtLinkedList<E> {
    private Node first;
    private Node last;
    private int size;

    public void add(Object obj){
        Node node = new Node(obj);
        if(first==null){
            first = node;
            last = node;
        } else{
            node.previous = last;
            node.next = null;

            last.next = node;
            last=node;
        }
        size++;
    }

    public void insert(int index, E obj){
        Node newNode = new Node(obj);
        Node temp = getNode(index);
        if(temp!=null){
            Node up = temp.previous;
            up.next = newNode;
            newNode.previous = up;

            newNode.next = temp;
            temp.previous = newNode;
        }
        size++;
    }

    public Object get(int index){
        Node temp = getNode(index);
        return temp!=null?temp.element:null;
    }

    public void checkRange(int index){
        if(index<0||index>size-1){
            throw new RuntimeException("索引数字不合法:" + index);
        }
    }

    public void remove(int index){
        Node temp = getNode(index);
        if(temp!=null){
            Node up = temp.previous;
            Node down = temp.next;
            if(up!=null){
                up.next = down;

            }
            if(down!=null){
                down.previous = up;
            }
            // 删除的是第一个的时候
            if(index==0){
                first = down;
            }
            // 删除的是最后一个的时候
            if(index==size-1){
                last=up;
            }
            size--;
        }
    }

    private Node getNode(int index){
        checkRange(index);
        Node temp = null;
        if(index<(size>>1)){ //右移1位相当于除以2
            temp = first;
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
        } else{
            temp = last;
            for(int i=size-1; i>index; i--){
                temp = temp.previous;
            }
        }
        return temp;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        Node temp = first;
        while(temp!=null){
            sb.append(temp.element + ",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length()-1, ']');
        return sb.toString();
    }

    public static void main(String[] args) {
        SxtLinkedList<String> list = new SxtLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list.toString());
        System.out.println(list.get(0)); // a
//        System.out.println(list.get(7)); // 索引数字不合法:0
        System.out.println(list.get(4)); // e
        System.out.println(list);
        list.remove(0);
        System.out.println(list); //[b,c,d,e,f]
        list.insert(3,"g");
        System.out.println(list); //[b,c,d,g,e,f]
    }
}




