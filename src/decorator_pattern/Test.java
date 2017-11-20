package decorator_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package decorator_pattern
 * @author wangzhenxin
 * @date 2017-09-11 16:21
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Test
 * @Description 类描述
 * @date 2017-09-11
 */

/**
 * 装饰模式:主要用与对现有类进行拓展时,起到装
 * 饰作用的类进行封装,而使的在不修改原有类的
 * 基础上,可以有选择的,按顺序的使用装饰功能包装
 * 原有对象.
 *
 * 装饰模式可以有效的将类的核心职责和装饰功能分开.从而去除相关类中
 * 重复的装饰逻辑
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Preson preson = new Preson("张三");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts1 = new TShirts();

        tShirts.Decorate(preson);
        bigTrouser.Decorate(tShirts);
        tShirts1.Decorate(bigTrouser);

        tShirts1.Show();

    }
}
