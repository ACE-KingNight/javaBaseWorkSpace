package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-23 17:05
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.util.List;

/**
 * @author wangzhenxin
 * @InterfaceName BaseService
 * @Description 基础公共Service
 * @date 2017-08-23
 */
public interface BaseService<T,K> {
    /**
     * @Title: add
     * @Description: 根据对象添加
     * @author wangzhenxin
     * @date 2017-08-23
     * @param t 添加对象
     * @return T
     */
    public T add(T t);
    /**
     * @Title: delById
     * @Description: 根据Id删除
     * @author wangzhenxin
     * @date 2017-08-23
     * @param k 删除对象Id
     * @return T
     */
    public T delById(K k);
    /**
     * @Title: updateById
     * @Description: 根据Id修改
     * @author wangzhenxin
     * @date 2017-08-23
     * @param t 更改对象
     * @return T
     */
    public T update(T t);
    /**
     * @Title:findById
     * @Description: 根据Id查询
     * @author wangzhenxin
     * @date 2017-08-23
     * @param k 更改对象Id
     * @return T
     */
    public T findById(K k);
    /**
     * @Title: addList
     * @Description: 根据对象集合批量添加
     * @author wangzhenxin
     * @date 2017-08-23
     * @param tList 添加对象集合
     * @return List<T>
     */
    public List<T> addList(List<T> tList);
    /**
     * @Title: delListByIdList
     * @Description: 根据Id集合删除对应对象
     * @author wangzhenxin
     * @date 2017-08-23
     * @param kList 删除对象Id集合
     * @return List<T>
     */
    public List<T> delListByIdList(List<K> kList);
    /**
     * @Title: updateListByIdList
     * @Description: 根据Id集合修改对应对象
     * @author wangzhenxin
     * @date 2017-08-23
     * @param tList 修改对象集合
     * @return List<T>
     */
    public T updateList(List<T> tList);
    /**
     * @Title: findListByIdList
     * @Description: 根据Id集合查找对应对象
     * @author wangzhenxin
     * @date 2017-08-23
     * @param kList 查找对象Id集合
     * @return List<T>
     */
    public List<T> findListByIdList(List<K> kList);
}
