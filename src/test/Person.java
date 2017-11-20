package test; /**
 * @Project: test
 * @Package com.springapp.mvc.entity
 * @author xiaoshijie
 * @date 2017/8/9 11:53
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.util.Date;

/**
 * @ClassName test.person
 * @author xiaoshijie
 * @Description 人员信息类
 * @date 2017/8/9
 */
public class Person {
    /**
     * name 姓名
     */
    private String name;
    /**
     * sex 性别 1-男，2-女
     */
    private Integer sex;
    /**
     * age 年龄
     */
    private Integer age;
    /**
     * birthday 出生日期 yyyy-MM-dd
     */
    private Date birthday;
    /**
     * money 银行卡余额
     */
    private Double money;

    public Person(){

    }

    public Person(String name, Integer sex, Integer age, Date birthday, Double money) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}



