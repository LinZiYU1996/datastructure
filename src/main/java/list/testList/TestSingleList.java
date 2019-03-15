package list.testList;

import list.SingleList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/*/**
 * @Description:    测试单链表
 */
public class TestSingleList {
    final static Logger logger = LoggerFactory.getLogger(TestSingleList.class);

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

    public static void test2(){
        Integer data[] = {10,5,32,69,50,8,0,-1};
        SingleList<Integer> singleList = new SingleList<Integer>();

        singleList.createSingleList(data);
//        logger.info("{}",singleList.length());

        Integer d1 = singleList.getElemt(4);
//        logger.info("{}",d1);

        int index = singleList.locate(8);
//        logger.info("{}",index);

//        singleList.insert(100,0);
//        singleList.insert(100,4);
//        singleList.outPut();

//        singleList.delete(5);
//        singleList.outPut();

//        singleList.setVal(5,500);
//        singleList.outPut();

        singleList.append(889);
        singleList.outPut();

    }




    public static void main(String[] args) {
            test2();
    }


}
