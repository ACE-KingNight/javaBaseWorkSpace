package state_Pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package state_Pattern
 * @author wangzhenxin
 * @date 2017-11-09 10:37
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName ForenoonState
 * @Description 上午工作状态类
 * @date 2017-11-09
 */
public class ForenoonState implements State{
    @Override
    public void writeProgram(Work work) {
        if (work.getHour().doubleValue() < 12){
            System.out.println("当前时间"+work.getHour()+"当前状态为1");
        }else {
            work.setState(new NoonState());
        }
    }
}
