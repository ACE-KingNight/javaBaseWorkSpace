package work_8_23;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_23
 * @author wangzhenxin
 * @date 2017-08-23 16:07
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.util.List;

/**
 * @author wangzhenxin
 * @ClassName InterfaceTest
 * @Description 类描述
 * @date 2017-08-23
 */
public interface InterfaceTest<T> {
    public void addPerson(T t);

    public List<T> findPerson(T id);

    public List<T> findPerson(List<T> idList);
}
