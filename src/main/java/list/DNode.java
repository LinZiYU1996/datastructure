package list;



/*/**
 * @Description:    双链表节点
 */
public class DNode<T> {

    public T data;

    public DNode<T> prior;

    public DNode<T> next;

    public DNode(T data,DNode<T> prior,DNode<T> next){
            this.data = data;
            this.prior = prior;
            this.next = next;
    }

    public DNode(){
        this(null,null,null);
    }


}
