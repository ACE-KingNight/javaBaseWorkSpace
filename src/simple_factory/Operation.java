package simple_factory;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package simple_factory
 * @author wangzhenxin
 * @date 2017-09-04 9:53
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Operation
 * @Description 运算父类
 * @date 2017-09-04
 */

/**
 * 简单工厂模式，用于一个类有多个实例化的继承类，
 * 将类的实例化托管给工厂，通过工厂去实例化类。
 */
public abstract class Operation {
    /**
     * 计算数1
     */
    protected Double number1 = 0d;
    /**
     * 计算数2
     */
    protected Double number2 = 0d;
    /**
     * 计算结果
     */
    protected Double result = 0d;

    public Double getNumber1() {
        return number1;
    }

    public Double getResult() throws Exception {
        return result;
    }

    public void setNumber1(Double number1) {
        this.number1 = number1;
    }

    public Double getNumber2() {
        return number2;
    }

    public void setNumber2(Double number2) {
        this.number2 = number2;
    }
}
