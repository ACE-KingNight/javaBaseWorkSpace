package state_Pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package state_Pattern
 * @author wangzhenxin
 * @date 2017-11-09 11:55
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Main
 * @Description 类描述
 * @date 2017-11-09
 */
public class Main {
    public static void main(String[] args) {
        Work newWork = new Work();
        newWork.setHour(9d);
        newWork.WriteProgram();
        newWork.setHour(10d);
        newWork.WriteProgram();
        newWork.setHour(12.5d);
        newWork.WriteProgram();
        newWork.setHour(12.5d);
        newWork.WriteProgram();
    }
}
