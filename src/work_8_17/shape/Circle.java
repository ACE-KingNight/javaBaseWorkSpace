package work_8_17.shape;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_17.shape
 * @author wangzhenxin
 * @date 2017-08-17 16:26
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Circle
 * @Description 圆形类
 * @date 2017-08-17
 */
public class Circle extends Shape{
    /**
     * 半径
     */
    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
    /**
     * @Title: perimeter
     * @Description: 根据半径计算圆形周长
     * @author wangzhenxin
     * @date 2017-08-21
     * @param radius 半径
     * @return Double
     */
    public Double perimeter(Double radius){
        super.perimeter = radius.doubleValue() * 2 * Shape.PIE.doubleValue();
        return super.perimeter;
    }
    /**
     * @Title: perimeter
     * @Description: 计算图形周长
     * @author wangzhenxin
     * @date 2017-08-21
     */
    public Double perimeter(){
        super.perimeter = this.radius.doubleValue() * 2 * Shape.PIE.doubleValue();
        return super.perimeter;
    }

    /**
     * @Title: area
     * @Description: 根据半径计算圆形面积
     * @author wangzhenxin
     * @date 2017-08-21
     * @param radius 半径
     * @return Double
     */

    public Double area(Double radius){
        super.area = Shape.PIE.doubleValue() * radius.doubleValue() * radius.doubleValue();
        return super.area;
    }

    /**
     * @Title: area
     * @Description: 计算圆形面积
     * @author wangzhenxin
     * @date 2017-08-21
     */

    public Double area(){
        super.area = Shape.PIE.doubleValue() * this.radius.doubleValue() * this.radius.doubleValue();
        return super.area;
    }
}
