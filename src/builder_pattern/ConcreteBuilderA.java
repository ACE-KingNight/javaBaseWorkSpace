package builder_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package builder_pattern
 * @author wangzhenxin
 * @date 2017-09-22 11:28
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName ConcreteBuilderA
 * @Description 建造者的具体实现类,通过本类完成建造对象的生成
 * @date 2017-09-22
 */
public class ConcreteBuilderA extends Builder {
    Product product = new Product();
    @Override
    public void buildPartA() {
        product.addParts("组件一");
    }

    @Override
    public void buildPartB() {
        product.addParts("组件二");
    }

    @Override
    public Product getProuce() {
        return product;
    }
}
