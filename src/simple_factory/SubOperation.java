package simple_factory;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package simple_factory
 * @author wangzhenxin
 * @date 2017-09-04 10:06
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName SubOperation
 * @Description 减法类
 * @date 2017-09-04
 */
public class SubOperation extends Operation {
    @Override
    public Double getResult(){
        super.result = super.number1 - super.number2;
        return super.result;
    }
}
