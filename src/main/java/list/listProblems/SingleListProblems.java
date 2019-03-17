package list.listProblems;


import list.Node;
import list.SingleList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/*/**
 * @Description:    关于单链表的一些算法题 (索引都是从0开始)
 */
public class SingleListProblems {

    final static Logger logger = LoggerFactory.getLogger(SingleListProblems.class);

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

    /*/**
     * @Description:    逆序输出单链表  （递归实现）
     */
    public static void printLinkListReserve(Node node) {
            if ( node.next != null) {
                printLinkListReserve(node.next);
            }
            logger.info("{}",node.data);

    }

    /*/**
     * @Description:    逆序输出单链表  （非递归实现）
     */
    public static void printLinkListReserving(Node node){
        Stack<Node> stack = new Stack<Node>();
        while (node != null){
                stack.add(node);
                node = node.next;
        }
        while ( !stack.empty()) {
            logger.info("{}",stack.pop().data);
        }

    }





    /*/**
     * @Description:    输入一个链表，输出该链表中倒数第k个结点
     *
     *                  使用快慢指针解决
     */
    public static void  findKth(Node node,int k){
        Node p1;
        Node p2;
        p1 = node;
        p2 = node;
        int i = 0;
        while ( p1 != null && i < k){
            p1 = p1.next;
            i++;
        }
        while ( p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        logger.info("{}",p2.data);


    }




    /*/**
     * @Description:    O(1)时间删除链表的结点
     */
    public void deleteNode(Node head, Node deleteNode){
        if(head==null || deleteNode==null){
            return;
        }
        if(deleteNode.next!=null){ //要删除的结点不是尾部结点
            Node pNext = deleteNode.next;
            deleteNode.data = pNext.data;
            deleteNode.next = pNext.next;
        }else if(head == deleteNode){ //链表只有一个结点，删除头结点
            head = null;
            deleteNode = null;
        }else{ //链表中有多个结点，删除尾结点
            Node pNode = head;
            while(pNode.next != deleteNode){
                pNode = pNode.next;
            }
            pNode.next = null;
        }
    }







    public static void main(String[] args) {
        Integer data[] = {0,1,2,3,4,5,6};
        SingleList<Integer> singleList = new SingleList<Integer>();
        singleList.createSingleList(data);

//        reverseSingleList(singleList);
//        singleList.outPut();

//        printLinkListReserve(singleList.head.next);


//        findKth(singleList.head.next,4);

        printLinkListReserving(singleList.head.next);


    }





}
