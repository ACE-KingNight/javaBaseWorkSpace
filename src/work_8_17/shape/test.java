package work_8_17.shape;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_17.shape
 * @author wangzhenxin
 * @date 2017-08-17 16:34
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName test
 * @Description 类描述
 * @date 2017-08-17
 */
public  class test {
    public static void main(String[] args) {
        Circle circle =new Circle();
        System.out.println(circle.perimeter(15D));
        System.out.println(circle.area(15d));

        circle.setRadius(10d);
        System.out.println(circle.perimeter());
        System.out.println(circle.area());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.perimeter(15d,20d));
        System.out.println(rectangle.area(15d, 20d));

        rectangle.setLength(15d);
        rectangle.setWide(20d);
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());

        Rectangle square = new Square();
        square.setLength(15d);
        System.out.println(square.area());

    }
}
