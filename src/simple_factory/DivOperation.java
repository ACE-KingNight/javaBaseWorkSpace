package simple_factory;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package simple_factory
 * @author wangzhenxin
 * @date 2017-09-04 10:12
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName DivOperation
 * @Description 除法类
 * @date 2017-09-04
 */
public class DivOperation extends Operation{
    @Override
    public Double getResult() throws Exception {
        if (super.number2 == 0){
            throw new Exception("除数不能为0");
        }
        super.result = super.number1 / super.number2;
        return super.result;
    }
}
