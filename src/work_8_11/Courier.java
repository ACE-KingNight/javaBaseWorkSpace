package work_8_11;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_11
 * @author wangzhenxin
 * @date 2017-08-11 20:56
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */



/**
 * @author wangzhenxin
 * @ClassName Courier
 * @Description 快递员类
 * @date 2017-08-11
 */
public class Courier {
    /**
     *nameStr 姓名
     */
    private String name;
    /**
     * sex 性别 m-男 f-女
     */
    private String sex="m";
    /**
     * age 年龄
     * */
    private Integer age=0;

    /**
     * height 身高(CM)
     */
    private Integer height=0;
    /**
     * education 学历
     */
    private String education;
    /**
     * id_number 身份证号码
     */
    private String  id_number;
    /**
     * phone 电话
     */
    private  String phone;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Courier(String name, String sex, Integer age, Integer height, String education, String id_number, String phone) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.education = education;
        this.id_number = id_number;
        this.phone = phone;
    }

    public Courier() {

    }
}
