package list.listProblems;


import list.Node;
import list.SingleList;

/*/**
 * @Description:    关于单链表的一些算法题
 */
public class SingleListProblems {

    /*/**
     * @Description:    原地翻转单链表(三个指针实现)
     */
    public static void reverseSingleList(SingleList singleList){
        if ( !singleList.isEmpty()){
            Node currentNode = singleList.head.next;
            Node preNode = null;
            while (currentNode != null){
                Node nextNode = currentNode.next;
                if (nextNode == null) {
                    singleList.head.next = currentNode;
                }
                currentNode.next = preNode;
                preNode = currentNode;
                currentNode = nextNode;
            }
        }
    }


    public static void main(String[] args) {
        Integer data[] = {0,1,2,3,4,5,6};
        SingleList<Integer> singleList = new SingleList<Integer>();
        singleList.createSingleList(data);
        reverseSingleList(singleList);
        singleList.outPut();


    }





}
