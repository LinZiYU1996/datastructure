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


    /*/**
     * @Description:    如何判断一个链表有环
     */
    public static boolean isLoopList(Node head){
            Node slowP;
            Node fastP;
            slowP = fastP = head;
            while (fastP != null && fastP.next != null){
                slowP = slowP.next;
                fastP = fastP.next.next;
                if ( slowP == fastP) {
                    return  true;
                }
            }
            return false;

    }



    /*/**
     * @Description:    两个链表的第一个公共结点
     */
//    public static  Node findFirstCommonNode(Node head1,Node head2){
//
//
//
//
//    }

    /*/**
     * @Description:    合并两个排序的链表
     */
    public static Node<Integer> mergeTwoSortedList(SingleList<Integer> s1,SingleList<Integer> s2){
            Node<Integer> h1 = s1.head.next;
            Node<Integer> h2 = s2.head.next;
            Node<Integer> head = new Node<Integer>();
            Node<Integer> current = head;
            while ( h1 != null && h2 != null) {
               if (h1.data <= h2.data) {
                   current.next = h1;
                   h1 = h1.next;
               } else {
                   current.next = h2;
                   h2 = h2.next;
               }
               current = current.next;
            }
            if (h1 != null) {
                current.next = h1;
            }
            if (h2 != null) {
                current.next = h2;
            }
            return  head.next;

    }







    public static void main(String[] args) {
        Integer data[] = {1,3,6,9,11};
        Integer data1[] = {2,5,7,10,25};
        SingleList<Integer> singleList = new SingleList<Integer>();
        SingleList<Integer> singleList2 = new SingleList<Integer>();
        singleList.createSingleList(data);
        singleList2.createSingleList(data1);

//        singleList.outPut();
//        singleList2.outPut();

        Node<Integer> node = mergeTwoSortedList(singleList,singleList2);
        while (node != null) {
            logger.info("{}",node.data);
            node = node.next;
        }




//        reverseSingleList(singleList);
//        singleList.outPut();

//        printLinkListReserve(singleList.head.next);


//        findKth(singleList.head.next,4);

//        printLinkListReserving(singleList.head.next);


    }





}
