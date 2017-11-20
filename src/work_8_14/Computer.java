package work_8_14;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_14
 * @author wangzhenxin
 * @date 2017-08-15 16:05
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Computer
 * @Description 电脑类
 * @date 2017-08-15
 */
public class Computer {
    /**
     * brand 品牌
     */
    private String brand;
    /**
     * price 价格
     */
    private Double price =0d;
    /**
     * model 型号
     */
    private String model;
    /**
     * manufacturer 生产商
     */
    private String manufacturer;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @Title: sell
     * @Description: 根据品牌售卖
     * @author wangzhenxin
     * @date 2017-08-15
     * @param brand 品牌
     * @return couputer 电脑对象
     */

    public Computer sell(String brand){
        Computer computer = new Computer();
        computer.setBrand(brand);
        return computer;
    }
    /**
     * @Title: sell
     * @Description: 根据价格和生产商售卖
     * @author wangzhenxin
     * @date 2017-08-15
     * @param price 价格
     * @param manufacturer 生产商
     * @return couputer 电脑对象
     */
    public Computer sell(Double price,String manufacturer){
        Computer computer = new Computer();
        computer.setPrice(price);
        computer.setManufacturer(manufacturer);
        return computer;
    }
    /**
     * @Title: sell
     * @Description: 根据型号和价格售卖
     * @author wangzhenxin
     * @date 2017-08-15
     * @param model 型号
     * @param price 价格
     * @return couputer 电脑对象
     */
    public Computer sell(String model,Double price){
        Computer computer = new Computer();
        computer.setModel(model);
        computer.setPrice(price);
        return computer;
    }
}
