package work_8_17;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_17
 * @author wangzhenxin
 * @date 2017-08-17 14:26
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Bicycle
 * @Description 自行车类
 * @date 2017-08-17
 */
public class Bicycle {

    public Bicycle(JiaoTongGongJu jiaoTongGongJu) {
        this.jiaoTongGongJu = jiaoTongGongJu;
    }
    private JiaoTongGongJu jiaoTongGongJu;


    public Bicycle() {

    }

    protected void print(){
        System.out.println("自行车输出!");
        jiaoTongGongJu.print();
    }
}
