package builder_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package builder_pattern
 * @author wangzhenxin
 * @date 2017-09-22 11:36
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Main
 * @Description 类描述
 * @date 2017-09-22
 */

/**
 * 建造者模式,通过对建造者的抽象,规定了建造过程中
 * 必要的流程及其数量,通过对建造者的继承,具体的建造类
 * 完成对产品的创建.
 *
 * 指挥者类,完成了在创建过程中产品的组装顺序.
 */



public class Main {
    public static void main(String[] args) {
        //创建指挥者对象,用于完成对产品的构造
        Director director = new Director();
        //用建造者的具体实现初始化建造者
        Builder builderA = new ConcreteBuilderA();
        Builder builderB = new ConcreteBuilderB();

        director.construct(builderA);
        Product productA = builderA.getProuce();
        productA.showProduct();

        director.construct(builderB);
        Product productB = builderB.getProuce();
        productB.showProduct();
    }
}
