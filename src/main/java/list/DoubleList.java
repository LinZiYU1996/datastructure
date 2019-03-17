package list;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*/**
 * @Description:    双链表
 */
public class DoubleList<T> implements commonList<T>{

    final static Logger logger = LoggerFactory.getLogger(DoubleList.class);

    public DNode<T> head;

    //初始化头结点
    public void initDoubleList(){
        this.head = new DNode<T>();
    }

    //整体创建双链表
    public void createDoubleList(T data[]){
        initDoubleList();
        DNode<T> rear = this.head;
        for (int i = 0 ; i < data.length ; i++){
            DNode<T> node = new DNode<T>();
            node.data = data[i];
            rear.next = node;
            node.prior = rear;
            rear = node;
        }
        rear.next = null;
    }


    //判断双链表是否为空
    public boolean isEmpty() {
        return this.head.next == null;
    }

    //返回双链表长度
    public int length() {
        int len = 0;
        DNode<T> p = this.head.next;
        if ( !isEmpty()){
            while ( p != null){
                len++;
                p = p.next;
            }
        }
        return  len;
    }

    //获取i位置的data
    public T getElemt(int i) {
        if ( !isEmpty() && (i >= 0 && i < length()) ){
            DNode<T> p = this.head.next;
            for (int j = 0 ; j < i ; j++){
                p = p.next;
            }
            return p.data;
        }
        return null;
    }

    //返回data 位置
    public int locate(T data) {
        if ( !isEmpty()){
            int i = 0;
            DNode<T> p = this.head.next;
            while ( p != null) {
                if ( p.data.equals(data)){
                    return i;
                }
                p = p.next;
                i++;
            }
            return i;
        }
        return -1;
    }

    //插入数据
    public void insert(T data, int i) {
        if (data ==null) {
            return;
        }
        if ( !isEmpty() && ( i >= 0 && i < length())) {
            DNode<T> p = this.head;
            for (int j = 0 ; p != null &&  j < i ; j++){
                p = p.next;
            }
            DNode<T> node = new DNode<T>();
            node.data = data;
            node.next = p.next;
            p.next.prior = node;
            p.next = node;
            node.prior = p;

        }
    }

    //删除数据
    public void delete(int i) {
        if ( !isEmpty() && ( i >= 0 && i < length()) ){
            DNode p = this.head;
            for ( int j = 0 ; p != null && j < i ; j++) {
                p = p.next;
            }
            p.next.prior = p;
            p.next = p.next.next;
        }
    }

    // 设值
    public void setVal(int i, T data) {
        if ( !isEmpty() && ( i >= 0 && i < length())){
            DNode p = this.head;
            for (int j = 0 ; p != null &&j <= i ; j++) {
                p = p.next;
            }
            p.data = data;
        }
    }

    //整体输出双链表
    public void outPut() {
        DNode<T> p = this.head.next;
        while ( p != null){
                logger.info("{}",p.data);
                p = p.next;
        }
    }

    //双链表末尾添加数据
    public void append(T data) {
            DNode p = this.head;
            while ( p.next != null){
                p = p.next;
            }
            DNode dNode = new DNode<T>();
            dNode.data = data;
            dNode.prior = p;
            p.next = dNode;
    }
}
