package work_8_17;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_17
 * @author wangzhenxin
 * @date 2017-08-17 14:28
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Main
 * @Description 类描述
 * @date 2017-08-17
 */
public class Main {
    static int test = 0;
    String outStr = "this is out Str";
    void useInner(){
        Inner inner = new Inner();
        System.out.println("外部类调用方法!");
        inner.print();
    }
    public static class Inner{
       void print(){
           System.out.println("this is inner str");
           System.out.println("这里调用了外部类属性"+Main.test);
       }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.useInner();
        System.out.println();
    }
}
