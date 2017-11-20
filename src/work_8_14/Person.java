package work_8_14;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_14
 * @author wangzhenxin
 * @date 2017-08-14 16:07
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName person
 * @Description 人类
 * @date 2017-08-14
 */
public class Person {
    static String test;
    /**
     * name 姓名
     * */
    private String name;
    /**
     * sex 性别 m-男，f-女
     * */
    private String sex="m";
    /**
     * age 年龄
     * */
    private Integer age;
    /**
     * height 身高(cm)
     * */
    private Integer height;
    /**
     * weight 体重(KG)
     * */
    private  Double weight;
    /**
     * eduBackground 学历
     * */
    private String eduBackground;
    /**
     * idCard 身份证号
     * */
    private String idCard;
    /**
     * phone 电话号码
     * */
    private String phone;
    /**
     * address 家庭住址
     * */
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getEduBackground() {
        return eduBackground;
    }

    public void setEduBackground(String eduBackground) {
        this.eduBackground = eduBackground;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @Title: eat
     * @Description: 吃饭方法
     * @author wangzhenxin
     * @date 2017-08-14
     */

    public static void eat(){
        System.out.println("我会吃");
    }

    /**
     * @Title: sleep
     * @Description: 睡觉方法
     * @author wangzhenxin
     * @date 2017-08-14
     */

    public void sleep(){
        System.out.println("我会睡觉");
    }
    /**
     * @Title: study
     * @Description: 学习
     * @author wangzhenxin
     * @date 2017-08-14
     */
    public void study(){
        System.out.println("我会学习");
    }

}
