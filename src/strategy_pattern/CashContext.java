package strategy_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package strategy_pattern
 * @author wangzhenxin
 * @date 2017-09-07 16:07
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName CashContext
 * @Description 策略连接工厂类
 * @date 2017-09-07
 */
public class CashContext {
    private Strategy strategy = null;

    public CashContext(String type) {
        switch (type){
            case "正常收费":
                strategy = new CashNormal();
                break;
            case "打折收费":
                strategy = new CashRebate(0.8d);
                break;
            case "返利收费":
                strategy = new CashReturn(300d,100d);
                break;
        }
    }
    public Double returnMoney(Double money){
        return  strategy.returnMoney(money);
    }

}
