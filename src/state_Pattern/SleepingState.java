package state_Pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package state_Pattern
 * @author wangzhenxin
 * @date 2017-11-09 11:53
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName SleepingState
 * @Description 类描述
 * @date 2017-11-09
 */
public class SleepingState implements State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前状态下班");
    }
}
