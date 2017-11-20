package work_8_17;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_17
 * @author wangzhenxin
 * @date 2017-08-17 11:35
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName JiaoTongGongJu
 * @Description 交通工具类
 * @date 2017-08-17
 */
public class JiaoTongGongJu {
    /**
     * 座位
     */
    protected Integer site;

    public JiaoTongGongJu(Integer site) {
        this.site = site;
    }

//    public JiaoTongGongJu() {
//
//    }

    public void print(){
        System.out.println("父类输出!");
        System.out.println(site);
    }
}
