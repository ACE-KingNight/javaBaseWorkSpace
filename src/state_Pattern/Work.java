package state_Pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package state_Pattern
 * @author wangzhenxin
 * @date 2017-11-09 10:34
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Work
 * @Description 工作状态的实体类
 * @date 2017-11-09
 */
public class Work {
    private State state;
    private Double hour;
    private Boolean finish = false;

    public Work() {
        state = new ForenoonState();
    }
    public void WriteProgram(){
        state.writeProgram(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public Double getHour() {
        return hour;
    }

    public void setHour(Double hour) {
        this.hour = hour;
    }

    public Boolean getFinish() {
        return finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }
}
