package state_Pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package state_Pattern
 * @author wangzhenxin
 * @date 2017-11-09 10:56
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName NoonState
 * @Description 中午工作状态
 * @date 2017-11-09
 */
public class NoonState implements State{
    @Override
    public void writeProgram(Work work) {
        if(work.getHour().doubleValue() < 13){
            System.out.println("当前时间"+work.getHour().doubleValue()+"当前状态2");
        }else {
            work.setState(new NoonState());
        }
    }
}
