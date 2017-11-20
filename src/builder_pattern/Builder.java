package builder_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package builder_pattern
 * @author wangzhenxin
 * @date 2017-09-22 11:20
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Builder
 * @Description 抽象的建造者类
 * @date 2017-09-22
 */
public abstract class Builder {
    /**
     * 抽象的建造者类,表明了该产品由两个组件构成
     */
    //抽象的创建组件方法
    public abstract void buildPartA();
    public abstract void buildPartB();

    /**
     * @Title: getProuce
     * @Description: 返回一个产品的结果
     * @author wangzhenxin
     * @date 2017-09-22
     */
    public abstract Product getProuce();
}
