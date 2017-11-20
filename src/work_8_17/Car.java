package work_8_17;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_17
 * @author wangzhenxin
 * @date 2017-08-17 11:40
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Car
 * @Description 类描述
 * @date 2017-08-17
 */
public class Car extends JiaoTongGongJu {

    public Car(Integer site) {
        super(site);
    }

    @Override
    public void print() {
        System.out.println("小汽车有"+super.site+"座位");
    }

    public int print(Integer integer){
        System.out.println("小汽车重载");
        return 1;
    }
}
