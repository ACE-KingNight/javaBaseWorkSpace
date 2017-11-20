package work_8_23;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_23
 * @author wangzhenxin
 * @date 2017-08-23 15:02
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName TestGeneric
 * @Description 类描述
 * @date 2017-08-23
 */
public abstract class TestGeneric<T> {
    private T testT;

    private T testTTwo;

    public void testPrint(){
        System.out.println(this.testT);
    }

    public T getTestT() {
        return testT;
    }

    public void setTestT(T testT) {
        this.testT = testT;
    }

    public T getTestTTwo() {
        return testTTwo;
    }

    public void setTestTTwo(T testTTwo) {
        this.testTTwo = testTTwo;
    }
    public abstract <P> P[] testP(P[] p);
    public abstract <P> void tes2();

//    public static void main(String[] args) {
//        TestGeneric testGeneric = new TestGeneric<String>();
//
//        testGeneric.setTestT("撒旦");
//        testGeneric.testPrint();
//        Integer[] ints={1,2,3,4};
//        Integer[] ints1 = (Integer[]) testGeneric.testP(ints);
//        for (Integer a:ints1){
//            System.out.println(a+"-2");
//        }
//    }
}

