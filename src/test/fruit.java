package test; /********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package PACKAGE_NAME
 * @author wangzhenxin
 * @date 2017-08-08 16:02
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName test.fruit
 * @Description 水果类
 * @date 2017-08-08
 */
public class fruit {

    //产品名
    private String nameStr="苹果";
    //数量
    private int numebetInt=1;
    //价格
    private double priceDouble=1000000000000000000000000d;
    //产地
    private String  originStr="河南";
    //重量
    private float weightFlaot = 12.5f;

    public String getNameStr() {
        return nameStr;
    }

    public void setNameStr(String nameStr) {
        this.nameStr = nameStr;
    }

    public int getNumebetInt() {
        return numebetInt;
    }

    public void setNumebetInt(int numebetInt) {
        this.numebetInt = numebetInt;
    }

    public double getPriceDouble() {
        return priceDouble;
    }

    public void setPriceDouble(double priceDouble) {
        this.priceDouble = priceDouble;
    }

    public String getOriginStr() {
        return originStr;
    }

    public void setOriginStr(String originStr) {
        this.originStr = originStr;
    }

    public float getWeightFlaot() {
        return weightFlaot;
    }

    public void setWeightFlaot(float weightFlaot) {
        this.weightFlaot = weightFlaot;
    }
}
