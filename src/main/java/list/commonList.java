package list;



/*/**
 * @Description:    链表的通用操作接口
 */
public interface commonList<T> {

    boolean isEmpty();  //判断是否为空

    int length(); //返回链表长度

    T getElemt(int i); // 返回第i个元素

    int locate(T data); //按data值查找，返回位置序号

    void insert(T data,int i); //在位置i插入data

    void delete(int i); // 删除位置i的元素

    void setVal(int i,T data); //i位置设为data

    void outPut(); //输出整条链表

    void append(T data);//  在链表最后插入元素




}
