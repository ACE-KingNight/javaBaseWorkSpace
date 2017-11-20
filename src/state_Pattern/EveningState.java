package state_Pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package state_Pattern
 * @author wangzhenxin
 * @date 2017-11-09 11:50
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName EveningState
 * @Description 类描述
 * @date 2017-11-09
 */
public class EveningState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getFinish()) {
            work.setState(new SleepingState());
        }else {
            System.out.println("当前为结束状态");
        }
    }
}
