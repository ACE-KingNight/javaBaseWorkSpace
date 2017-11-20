package strategy_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package strategy_pattern
 * @author wangzhenxin
 * @date 2017-09-07 15:43
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Strategy
 * @Description 商场促销策略
 * @date 2017-09-07
 */
public abstract class Strategy {
    /**
     * @Title: returnMoney
     * @Description: 返回结算金额
     * @author wangzhenxin
     * @date 2017-09-07
     */
    public abstract Double returnMoney(Double money);
}
