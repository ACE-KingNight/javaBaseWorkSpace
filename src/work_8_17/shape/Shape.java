package work_8_17.shape;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_17.shape
 * @author wangzhenxin
 * @date 2017-08-17 16:22
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Shape
 * @Description 图形类
 * @date 2017-08-17
 */
public abstract class Shape {

    public static final Double PIE = 3.14d;
    /**
     * 周长
     */
    protected Double perimeter;
    /**
     * 面积
     */
    protected Double area;

    public Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    /**
     * @Title: area
     * @Description: 计算图形面积
     * @author wangzhenxin
     * @date 2017-08-21
     */
    public abstract Double area();
    /**
     * @Title: perimeter
     * @Description: 计算图形周长
     * @author wangzhenxin
     * @date 2017-08-21
     */
    public abstract Double perimeter();

}
