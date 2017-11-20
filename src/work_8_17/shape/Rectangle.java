package work_8_17.shape;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_17.shape
 * @author wangzhenxin
 * @date 2017-08-17 16:25
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Rectangle
 * @Description 矩形类
 * @date 2017-08-17
 */
public class Rectangle extends Shape{

    /**
     * 长
     */
    private Double length;
    /**
     * 宽
     */
    private Double wide;

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWide() {
        return wide;
    }

    public void setWide(Double wide) {
        this.wide = wide;
    }

    /**
     * @Title: perimeter
     * @Description: 根据长和宽计算矩形边长
     * @author wangzhenxin
     * @date 2017-08-21
     * @param length 长
     * @param wide 宽
     * @return Double
     */

    public Double perimeter(Double length,Double wide){
        super.perimeter = 2 * length.doubleValue() + 2 * wide.doubleValue();
        return super.perimeter;
    }
    /**
     * @Title: perimeter
     * @Description: 计算矩形边长
     * @author wangzhenxin
     * @date 2017-08-21
     */
    public Double perimeter(){
        super.perimeter = this.length.doubleValue() * 2 + 2 * this.wide.doubleValue();
        return super.perimeter;
    }
    /**
     * @Title: area
     * @Description: 根据长和宽计算矩形面积
     * @author wangzhenxin
     * @date 2017-08-21
     * @param length 长
     * @param wide 宽
     * @return Double
     */
    public Double area(Double length,Double wide){
        super.area = length.doubleValue() * wide.doubleValue();
        return super.area;
    }
    /**
     * @Title: area
     * @Description: 根据长和宽计算矩形面积
     * @author wangzhenxin
     * @date 2017-08-21
     */
    public Double area(){
        super.area = this.length.doubleValue() * this.wide.doubleValue();
        return super.area;
    }
}
