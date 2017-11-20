package builder_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package builder_pattern
 * @author wangzhenxin
 * @date 2017-09-22 11:30
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName ConcreteBuilderB
 * @Description 具体建造者类,用于同一产品的不同表现
 * @date 2017-09-22
 */
public class ConcreteBuilderB extends Builder {
    Product product = new Product();
    @Override
    public void buildPartA() {
        product.addParts("B组件一");
    }

    @Override
    public void buildPartB() {
        product.addParts("B组件二");
    }

    @Override
    public Product getProuce() {
        return product;
    }
}
