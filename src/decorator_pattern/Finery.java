package decorator_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package decorator_pattern
 * @author wangzhenxin
 * @date 2017-09-11 14:41
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Finery
 * @Description 服装类
 * @date 2017-09-11
 */
public class Finery extends Preson{
    protected Preson component;

    //打扮方法
    public void Decorate(Preson component){
        this.component = component;
    }

    @Override
    public void Show(){
        if (component != null){
            component.Show();
        }
    }
}
