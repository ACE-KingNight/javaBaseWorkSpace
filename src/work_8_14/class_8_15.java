package work_8_14;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_14
 * @author wangzhenxin
 * @date 2017-08-15 15:03
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.util.Arrays;
import java.util.Objects;

/**
 * @author wangzhenxin
 * @ClassName class_8_15
 * @Description 类描述
 * @date 2017-08-15
 */
public class class_8_15 {
    public static void test(Object ... objects){
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
//        System.out.println(objects);
    }

    public static void main(String[] args) {
        Object[] ints = {1,2,3,4};
        class_8_15.test(ints);
    }
    public void test1(){

    }
    public void test2(Integer integer) {

    }
    public Integer test3(){

        return null;
    }
    public Integer test4(Integer integer){
        return integer;
    }

}
