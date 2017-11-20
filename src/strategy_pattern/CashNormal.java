package strategy_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package strategy_pattern
 * @author wangzhenxin
 * @date 2017-09-07 15:50
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName CashNormal
 * @Description 正常收费算法
 * @date 2017-09-07
 */
public class CashNormal extends Strategy{
    @Override
    public Double returnMoney(Double money) {
        return money;
    }
}
