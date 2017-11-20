package proxy_pattern;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package proxy_pattern
 * @author wangzhenxin
 * @date 2017-10-18 14:44
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Test
 * @Description 类描述
 * @date 2017-10-18
 */

/**
 *
 * 代理模式,通过将接口的实现代理给第三方
 * 从而将接口的实现与接口风离开来,达到降低耦合,
 * 在需要跟换接口的实现方式时,只需要将代理类进行
 * 修改
 *
 */
public class Test {
    public static void main(String[] args) {
        SourceAble sourceAble = new Proxy();
        sourceAble.mothed();
    }
}
