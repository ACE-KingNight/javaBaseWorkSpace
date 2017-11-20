package decorator_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package decorator_pattern
 * @author wangzhenxin
 * @date 2017-09-11 14:29
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Preson
 * @Description 人类
 * @date 2017-09-11
 */
public class Preson {
    /**
     * 人名
     */
    private String name;

    public void Show(){
        System.out.println("装扮的"+name);
    }

    public Preson(String name) {
        this.name = name;
    }

    public Preson() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
