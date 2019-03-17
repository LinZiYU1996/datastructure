package list.testList;


import list.DoubleList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/*/**
 * @Description:    测试双链表
 */
public class TestDList {

    final static Logger logger = LoggerFactory.getLogger(TestDList.class);

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

    public static void  test2(){
        Integer data[] = {1,2,3,4,5,6,7,8,9};
        DoubleList<Integer> doubleList = new DoubleList<Integer>();
        doubleList.createDoubleList(data);

//        int len = doubleList.length();
//        logger.info("{}",len);

//        logger.info("{}",doubleList.getElemt(6));

//        logger.info("{}",doubleList.locate(1));


//        doubleList.insert(100,3);

//        doubleList.delete(5);

//        doubleList.setVal(3,500);

        doubleList.append(9000);

        doubleList.outPut();

    }




    public static void main(String[] args) {
//        test1();
        test2();
    }

}
