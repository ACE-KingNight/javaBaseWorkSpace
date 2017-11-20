package proxy_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package proxy_pattern
 * @author wangzhenxin
 * @date 2017-10-18 14:41
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Source
 * @Description 类描述
 * @date 2017-10-18
 */
public class Source implements SourceAble{
    @Override
    public void mothed() {
        System.out.println("代理模式");
    }
}
