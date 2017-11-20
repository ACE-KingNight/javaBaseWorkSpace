package mobile_package.entity;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package
 * @author wangzhenxin
 * @date 2017-08-16 17:55
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName IdEntity
 * @Description 主键ID实体
 * @date 2017-08-16
 */
public class IdEntity<T> {
    protected static final long serialVersionUID = -7523987970034925805L;
    /**
     * ID 套餐购买编号
     */
    protected T id;//ID

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "PrimaryKey{" +
                "id=" + id +
                '}';
    }
}
