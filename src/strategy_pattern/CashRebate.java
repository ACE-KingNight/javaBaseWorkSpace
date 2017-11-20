package strategy_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package strategy_pattern
 * @author wangzhenxin
 * @date 2017-09-07 15:52
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName CashRebate
 * @Description 打折策略
 * @date 2017-09-07
 */
public class CashRebate extends Strategy{
    /**
     * moneyRebate 打折折扣率
     */
    private Double moneyRebate =1d;

    public CashRebate(Double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public Double returnMoney(Double money) {
        return money * moneyRebate;
    }
}
