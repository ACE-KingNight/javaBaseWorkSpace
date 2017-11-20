package work_8_17.shape;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_17.shape
 * @author wangzhenxin
 * @date 2017-08-21 16:58
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Square
 * @Description 类描述
 * @date 2017-08-21
 */
public class Square extends Rectangle {
    /**
     * length 边长
     */
    private Double length;

    /**
     * @Title: area
     * @Description: 根据边长计算正方形面积
     * @author wangzhenxin
     * @date 2017-08-21
     */
    @Override
    public Double area() {
        super.area = this.length.doubleValue() * this.length.doubleValue();
        return super.area;
    }
    /**
     * @Title: area
     * @Description: 根据边长计算正方形周长
     * @author wangzhenxin
     * @date 2017-08-21
     */
    @Override
    public Double perimeter() {
        super.perimeter = 4 * length;
        return super.perimeter();
    }

    @Override
    public Double getLength() {
        return length;
    }

    @Override
    public void setLength(Double length) {
        this.length = length;
    }
}
