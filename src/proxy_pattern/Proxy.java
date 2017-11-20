package proxy_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package proxy_pattern
 * @author wangzhenxin
 * @date 2017-10-18 14:42
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Proxy
 * @Description 类描述
 * @date 2017-10-18
 */
public class Proxy implements SourceAble {
    private Source source;

    public Proxy() {
        this.source = new Source();
    }

    @Override
    public void mothed() {
        //代理Source的行为
        System.out.println("代理前");
        source.mothed();
        System.out.println("代理后");
    }
}
