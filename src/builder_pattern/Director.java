package builder_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package builder_pattern
 * @author wangzhenxin
 * @date 2017-09-22 11:33
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Director
 * @Description 指挥者类,用于指挥建造过程
 * @date 2017-09-22
 */
public class Director {
    /**
     * @Title: construct
     * @Description: 指挥者的创建方法,用于指挥建造过程
     * @author wangzhenxin
     * @date 2017-09-22
     */

    public void construct(Builder builder){
        builder.buildPartB();
        builder.buildPartA();
        builder.buildPartB();
    }
}
