package work_8_17;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_17
 * @author wangzhenxin
 * @date 2017-08-17 11:37
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Bus
 * @Description 类描述
 * @date 2017-08-17
 */
public class Bus extends JiaoTongGongJu {

    public Bus(Integer site) {
        super(site);
    }

    @Override
    public void print() {
        System.out.println("公交车有"+super.site+"座位");
    }
}
