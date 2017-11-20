package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-23 17:52
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author wangzhenxin
 * @ClassName BaseServiceImpl
 * @Description 基础公共Service实现
 * @date 2017-08-23
 */
public class BaseServiceImpl<T,K> implements BaseService<T,K> {
    /**
     * 定义泛型类的class
     */
    private Class<T> tClass;

    public BaseServiceImpl(){
        this.tClass= (Class<T>) getBaseServiceImplClass();
    }
    /**
     * @Title: getBaseServiceImplClass
     * @Description: 获取当前类的父类然后获取父类的泛型类型，返回第一个泛型类型的class
     * @author wangzhenxin
     * @date 2017-08-23
     * @return Class<?>
     */
    public Class<?> getBaseServiceImplClass(){
        //获取当前类的直接父类
        Type type=getClass().getGenericSuperclass();
        //判断类型是否有泛型
        if (type instanceof ParameterizedType){
            //获取他的泛型类型的数组
            Type[] types=((ParameterizedType) type).getActualTypeArguments();
            //返回第一个泛型类型的class
            return (Class<?>) types[0];
        }else {
            return Object.class;
        }
    }
    /**
     * @Title: add
     * @Description: 根据对象添加
     * @author wangzhenxin
     * @date 2017-08-23
     * @param t 添加对象
     * @return T
     */
    @Override
    public T add(T t) {
        return null;
    }
    /**
     * @Title: delById
     * @Description: 根据Id删除
     * @author wangzhenxin
     * @date 2017-08-23
     * @param k 删除对象Id
     * @return T
     */
    @Override
    public T delById(K k) {
        return null;
    }
    /**
     * @Title: updateById
     * @Description: 根据Id修改
     * @author wangzhenxin
     * @date 2017-08-23
     * @param t 更改对象
     * @return T
     */
    @Override
    public T update(T t) {
        return null;
    }
    /**
     * @Title:findById
     * @Description: 根据Id查询
     * @author wangzhenxin
     * @date 2017-08-23
     * @param k 更改对象Id
     * @return T
     */
    @Override
    public T findById(K k) {
        return null;
    }
    /**
     * @Title: addBaseList
     * @Description: 根据对象集合批量添加
     * @author wangzhenxin
     * @date 2017-08-23
     * @param tList 添加对象集合
     * @return List<T>
     */
    @Override
    public List<T> addList(List<T> tList) {
        return null;
    }
    /**
     * @Title: delListByIdList
     * @Description: 根据Id集合删除对应对象
     * @author wangzhenxin
     * @date 2017-08-23
     * @param kList 删除对象Id集合
     * @return List<T>
     */
    @Override
    public List<T> delListByIdList(List<K> kList) {
        return null;
    }
    /**
     * @Title: updateListByIdList
     * @Description: 根据Id集合修改对应对象
     * @author wangzhenxin
     * @date 2017-08-23
     * @param tList 修改对象集合
     * @return T
     */
    @Override
    public T updateList(List<T> tList) {
        return null;
    }
    /**
     * @Title: findListByIdList
     * @Description: 根据Id集合查找对应对象
     * @author wangzhenxin
     * @date 2017-08-23
     * @param kList 查找对象Id集合
     * @return List<T>
     */
    @Override
    public List<T> findListByIdList(List<K> kList) {
        return null;
    }
}
