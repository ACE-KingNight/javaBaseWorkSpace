package decorator_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package decorator_pattern
 * @author wangzhenxin
 * @date 2017-09-11 16:16
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName TShirts
 * @Description T恤类
 * @date 2017-09-11
 */
public class TShirts extends Finery {
    private static int i =0;
    @Override
    public void Show(){
        i++;
        System.out.println("T恤"+i);
        super.Show();
    }
}
