package list;


/*/**
 * @Description:    单链表
 */
public class SingleList<T> implements commonList<T>{

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
                rear.next = rear;
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
        if (i > 0) {
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
    public int locate(T data) {
        Node<T> p = this.head.next;
        int index = 1;
        while (p != null) {
            if (p.data.equals(data)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public void insert(T data, int i) {
        if ( data == null ){
            return;
        }
        Node<T> p = this.head;
        for(int j = 0 ; p != null && j < i ; j++){
            p = p.next;
        }
        p.next = new Node<T>(data,p.next);

    }

    public void delete(int i) {

    }
}
