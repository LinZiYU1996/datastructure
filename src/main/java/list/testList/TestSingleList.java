package list.testList;

import list.SingleList;

import java.util.Random;

/*/**
 * @Description:    测试单链表
 */
public class TestSingleList {

    public static void test1(){
        Random random = new Random();
        Integer data[] = new Integer[10];
        for ( int i = 0 ; i < data.length ; i++) {
            data[i] = random.nextInt(30);
        }
        SingleList<Integer> singleList = new SingleList<Integer>();
        singleList.createSingleList(data);
        singleList.outPut();



    }

    public static void main(String[] args) {
            TestSingleList.test1();
    }


}
