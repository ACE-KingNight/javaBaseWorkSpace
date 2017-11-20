package simple_factory;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package simple_factory
 * @author wangzhenxin
 * @date 2017-09-04 10:18
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName OperationFactory
 * @Description 计算工厂类
 * @date 2017-09-04
 */
public class OperationFactory {
    public static Operation createOperation(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
            default:
                try {
                    throw new Exception("请输入正确的符号");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
        return operation;
    }
}
