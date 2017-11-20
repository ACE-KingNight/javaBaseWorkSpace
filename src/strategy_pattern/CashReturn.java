package strategy_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package strategy_pattern
 * @author wangzhenxin
 * @date 2017-09-07 15:58
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName CashReturn
 * @Description 返利收费策略
 * @date 2017-09-07
 */
public class CashReturn extends Strategy {
    /**
     * moneyCondition 返利参数
     */
    private Double moneyCondition;
    /**
     * moneyReturn 返利额度
     */
    private Double moneyReturn;

    public CashReturn(Double moneyCondition, Double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public Double returnMoney(Double money) {
        if (money.doubleValue() > moneyCondition.doubleValue()){
            money = money.doubleValue() - Math.floor(money.doubleValue()/moneyCondition.doubleValue()) * moneyReturn.doubleValue();
        }
        return money;
    }
}
