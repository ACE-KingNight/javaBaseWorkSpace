package strategy_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package strategy_pattern
 * @author wangzhenxin
 * @date 2017-09-07 16:15
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Test
 * @Description 测试类
 * @date 2017-09-07
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 策略模式:通过对有同类相同操作的算法进行封装，
         * 使用户在使用算法时不需要了解算法实现，从而达到降低
         * 耦合度的问题
         * 策略模式简单化了单元测试，可以通过本类的实现进行单独测试
         */
        CashContext cashContext = new CashContext("正常收费");
        System.out.println(cashContext.returnMoney(1000d));
        CashContext cashContext1 = new CashContext("打折收费");
        System.out.println(cashContext1.returnMoney(1000d));
        CashContext cashContext2 = new CashContext("返利收费");
        System.out.println(cashContext2.returnMoney(1000d));
    }
}
