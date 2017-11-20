package decorator_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package decorator_pattern
 * @author wangzhenxin
 * @date 2017-09-11 16:17
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName BigTrouser
 * @Description 垮裤
 * @date 2017-09-11
 */
public class BigTrouser extends Finery{
    @Override
    public void Show(){
        System.out.println("垮裤");
        super.Show();
    }
}
