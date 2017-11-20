package builder_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package builder_pattern
 * @author wangzhenxin
 * @date 2017-09-22 11:12
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */
/**
 * 建造者模式
 *
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhenxin
 * @ClassName Product
 * @Description 产品类,由多个组件组成
 * @date 2017-09-22
 */
public class Product {
    //产品的组件集合,用于存储产品的组件
    List<String> parts = new ArrayList<String>();

    /**
     * @Title: addParts
     * @Description: 添加组件方法
     * @author wangzhenxin
     * @date 2017-09-22
     * @param parts 组件
     */
    public void addParts(String parts){
        this.parts.add(parts);
    }
    /**
     * @Title: showProduct
     * @Description: 展示产品
     * @author wangzhenxin
     * @date 2017-09-22
     */
    public void showProduct(){
        System.out.print("这个产品是:");
        for (String string:parts){
            System.out.print(string);
        }
        System.out.println("");
    }
}
