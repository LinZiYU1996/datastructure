package list;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*/**
 * @Description:    双链表
 */
public class DoubleList<T> implements commonList{

    final static Logger logger = LoggerFactory.getLogger(SingleList.class);

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









    public boolean isEmpty() {
        return false;
    }

    public int length() {
        return 0;
    }

    public Object getElemt(int i) {
        return null;
    }

    public int locate(Object data) {
        return 0;
    }

    public void insert(Object data, int i) {

    }

    public void delete(int i) {

    }

    public void setVal(int i, Object data) {

    }

    //整体输出双链表
    public void outPut() {
        DNode<T> p = this.head.next;
        while ( p != null){
                logger.info("{}",p.data);
                p = p.next;
        }
    }

    public void append(Object data) {

    }
}
