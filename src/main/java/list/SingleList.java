package list;


/*/**
 * @Description:    单链表
 */


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingleList<T> implements commonList<T>{

    final static Logger logger = LoggerFactory.getLogger(SingleList.class);

    public Node<T> head;

    //初始化空的单链表，头结点设置为空
    public void initSingleList(){
        head = new Node<T>();
    }



    //尾插法进行单链表的创建
    public void createSingleList(T data[]){
            initSingleList();
            Node<T> rear = this.head;
            for (int i = 0; i < data.length ; i++) {
                rear.next = new Node<T>(data[i],null);
                rear = rear.next;
            }
    }


    //判断单链表是否为空
    public boolean isEmpty() {
        return this.head.next == null;
    }

    public int length() {
        int len = 0;
        Node<T> p = this.head.next;
        while (p != null) {
            len++;
            p = p.next;
        }
        return len;
    }

    //返回第i个元素的值 没有则返回null
    public T getElemt(int i) {
        if (i >= 0 && !isEmpty()) {
            Node<T> p = this.head.next;
            for(int j=0 ; p != null && j < i ; j++){
                p = p.next;
            }
            if ( p != null) {
                return p.data;
            }
        }
        return null;
    }

    //根据 data值查找，存在返回位置序号 ， 不存在返回-1
    public int locate(T data)
    {
        if ( !isEmpty()) {
            Node<T> p = this.head.next;
            int index = 0;
            while (p != null) {
                if (p.data.equals(data)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }
    //在i位置插入数据data
    public void insert(T data, int i) {
        if ( data == null ){
            return;
        }
        if ( i >= 0 && i <= length() - 1) {
            Node<T> p = this.head;
            for(int j = 0 ; p != null && j < i ; j++){
                p = p.next;
            }
            Node<T> newNode = new Node<T>(data,null);
            newNode.next = p.next;
            p.next = newNode;
        }

    }

    //删除i位置的数据
    public void delete(int i) {
        if ( (i >=0 && i <= length() - 1) && !isEmpty()){
            Node<T> p = this.head;
            for(int j = 0 ; p != null && j < i ; j++){
                p = p.next;
            }
            p.next = p.next.next;
        }
    }

    // 更改i位置值为data
    public void setVal(int i, T data) {
        if( !isEmpty() && (i >= 0 && i <= length()-1)){
            Node<T> p = this.head;
            for (int j = 0; p != null && j <= i ; j++) {
                p = p.next;
            }
            p.data = data;
        }
    }

    //输出链表
    public void outPut() {
        if ( !isEmpty()) {
            Node<T> p = this.head.next;
            while ( p != null) {
                logger.info("{}",p.data);
                p = p.next;
            }
        }
    }
}
