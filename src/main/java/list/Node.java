package list;


/*/**
 * @Description:    单链表节点 ,T表示指定节点的元素类型
 */
public class Node<T> {

    public T data; //节点数据

    public Node<T> next;//后继节点

    //构造函数
    public Node(T data,Node<T> next){
        this.next = next;
        this.data = data;
    }

    public Node(){
        this(null,null);
    }




}
