package list.testList;


import list.DoubleList;

import java.util.Random;

/*/**
 * @Description:    测试双链表
 */
public class TestDList {

    public static void  test1(){
        Random r = new Random();
        Integer data[] = new Integer[10];
        for (int i = 0 ; i < data.length ; i++){
            data[i] = r.nextInt(200);
        }
        DoubleList<Integer> doubleList = new DoubleList<Integer>();
        doubleList.createDoubleList(data);
        doubleList.outPut();

    }

    public static void main(String[] args) {
        test1();
    }

}
