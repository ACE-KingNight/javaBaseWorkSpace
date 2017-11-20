package simple_factory;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package simple_factory
 * @author wangzhenxin
 * @date 2017-09-04 10:28
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName TestOperation
 * @Description 测试类
 * @date 2017-09-04
 */
public class TestOperation {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("*");
        operation.setNumber1(456d);
        operation.setNumber2(3d);
        try {
            System.out.println(operation.getResult());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
