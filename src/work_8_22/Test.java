package work_8_22;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_22
 * @author wangzhenxin
 * @date 2017-08-22 16:07
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.util.Date;

/**
 * @author wangzhenxin
 * @ClassName Test
 * @Description 类描述
 * @date 2017-08-22
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            int a = test.test(0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
//            e.printStackTrace();
        }


//        try {
//            int a = test.test();
//        }catch (ArithmeticException e){
//            System.out.println("oo");
//        }
    }
    public int test(int b) throws ArithmeticException{
        int a = 0;

        if (b==0){
            throw new ArithmeticException("除数不能为0");
        }
//        System.out.println("a/b="+a/b);
//        return a;
//        try {
//            a=2;
//            System.out.println("a:"+a);
//            System.out.println("a/b="+a/b);
//        }catch (ArithmeticException e){
//            a=4;
//            System.out.println("catch:"+a);
////            e.getCause();
////            e.getMessage();
//            e.printStackTrace();
//            System.out.println("程序出现异常变量b不能为0");
//            return a;
//
//        }finally {
//            a=5;
//            System.out.println("finally:"+a);
//            return a;
//        }
//        System.out.println(a);
//        System.out.println("程序正常结束");
        return 0;
    }
}
