package work_8_15;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_15
 * @author wangzhenxin
 * @date 2017-08-15 18:30
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.util.Date;

/**
 * @author wangzhenxin
 * @ClassName SalesPromotion
 * @Description 促销方案方法类
 * @date 2017-08-15
 */
public class SalesPromotion {
    /**
     * @Title: sale
     * @Description: 根据套餐短信数和分钟数促销
     * @author wangzhenxin
     * @date 2017-08-15
     * @param SMS 短信条数
     * @param callDuration 通话时长
     */
    public void sale(Integer SMS,Integer callDuration){
        if (SMS == null || callDuration == null) {
            System.out.println("请输入方案数据!!");
            return;
        }
        //创建两个客户对象
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        //对象设值
        customer1.setName("张三");
        customer1.setBalance(500.5d);
        customer1.setBeginUsedPackage("");
        customer2.setName("李四");
        customer2.setBalance(1100.5d);
        customer2.setBeginUsedPackage("");
        //创建套餐信息对象
        PackageInformation packageInformation = new PackageInformation();
        //设置套餐编号
        packageInformation.setNumber("008");
        //设置短信数为输入短信数
        packageInformation.setSMS(SMS);
        //设置通话时长为输入时长
        packageInformation.setCallDuration(callDuration);
        //设置套餐月租
        packageInformation.setMonthlyRent(50d);
        //创建两个套餐购买信息对象
        PackPurInformation packPurInformation1 = new PackPurInformation();
        PackPurInformation packPurInformation2 = new PackPurInformation();
        //设置购买人
        packPurInformation1.setPurchaser(customer1.getName());
        packPurInformation2.setPurchaser(customer2.getName());
        //设置购买日期为当天时间
        packPurInformation1.setPurchasingDate(new Date());
        packPurInformation2.setPurchasingDate(new Date());
        //设置购买套餐编号
        packPurInformation1.setPackageInformation(packageInformation.getNumber());
        packPurInformation2.setPackageInformation(packageInformation.getNumber());
        //设置支付金额为套餐月租
        packPurInformation1.setPaymentAmount(packageInformation.getMonthlyRent());
        packPurInformation2.setPaymentAmount(packageInformation.getMonthlyRent());
        //设置用户余额为余额减去月租
        customer1.setBalance(customer1.getBalance()-packageInformation.getMonthlyRent());
        customer2.setBalance(customer2.getBalance()-packageInformation.getMonthlyRent());
        //设置用户购买成功
        packPurInformation1.setIsPaySucceed(true);
        packPurInformation2.setIsPaySucceed(true);
        //设置套餐执行时间为当前日期
        packPurInformation1.setExecutionDate(new Date());
        packPurInformation2.setExecutionDate(new Date());
        System.out.println("根据短信和通话时长！");
        System.out.println("购买人1:"+packPurInformation1.getPurchaser());
        System.out.println("购买人2:"+packPurInformation2.getPurchaser());
    }
    /**
     * @Title: sale
     * @Description:根据彩铃和月租促销
     * @author wangzhenxin
     * @date 2017-08-15
     * @param isRbt 是否有彩铃
     * @param monthlyRent 月租
     */
    public void sale(Boolean isRbt,Double monthlyRent){
        if (isRbt == null || monthlyRent == null) {
            System.out.println("请输入方案数据!!");
            return;
        }
        //创建两个客户对象
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        //对象设值
        customer1.setName("张三");
        customer1.setBalance(500.5d);
        customer1.setBeginUsedPackage("");
        customer2.setName("李四");
        customer2.setBalance(1100.5d);
        customer2.setBeginUsedPackage("");
        //创建套餐信息对象
        PackageInformation packageInformation = new PackageInformation();
        //设置套餐编号
        packageInformation.setNumber("008");
        //设置是否有彩铃
        packageInformation.setIsRbt(isRbt);
        //设置月租为输入月租
        packageInformation.setMonthlyRent(monthlyRent);
        //创建两个套餐购买信息对象
        PackPurInformation packPurInformation1 = new PackPurInformation();
        PackPurInformation packPurInformation2 = new PackPurInformation();
        //设置购买人
        packPurInformation1.setPurchaser(customer1.getName());
        packPurInformation2.setPurchaser(customer2.getName());
        //设置购买日期为当天时间
        packPurInformation1.setPurchasingDate(new Date());
        packPurInformation2.setPurchasingDate(new Date());
        //设置购买套餐编号
        packPurInformation1.setPackageInformation(packageInformation.getNumber());
        packPurInformation2.setPackageInformation(packageInformation.getNumber());
        //设置支付金额为套餐月租
        packPurInformation1.setPaymentAmount(packageInformation.getMonthlyRent());
        packPurInformation2.setPaymentAmount(packageInformation.getMonthlyRent());
        //设置用户余额为余额减去月租
        customer1.setBalance(customer1.getBalance()-packageInformation.getMonthlyRent());
        customer2.setBalance(customer2.getBalance()-packageInformation.getMonthlyRent());
        //设置用户购买成功
        packPurInformation1.setIsPaySucceed(true);
        packPurInformation2.setIsPaySucceed(true);
        //设置套餐执行时间为当前日期
        packPurInformation1.setExecutionDate(new Date());
        packPurInformation2.setExecutionDate(new Date());
        System.out.println("根据彩铃和月租！");
        System.out.println("购买人1:"+packPurInformation1.getPurchaser());
        System.out.println("购买人2:"+packPurInformation2.getPurchaser());
    }
    /**
     * @Title: sale
     * @Description: 话费分钟数和流量数量，月租促销
     * @author wangzhenxin
     * @date 2017-08-15
     * @param callDuration 通话时长
     * @param mobileTraffic 流量数
     * @param unit 流量单位
     * @param monthlyRent 月租
     */
    public void sale(Integer callDuration,Integer mobileTraffic,String unit,Double monthlyRent){
        if (callDuration == null ||mobileTraffic == null || monthlyRent == null) {
            System.out.println("请输入方案数据!!");
            return;
        }
        //创建两个客户对象
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        //对象设值
        customer1.setName("张三");
        customer1.setBalance(500.5d);
        customer1.setBeginUsedPackage("");
        customer2.setName("李四");
        customer2.setBalance(1100.5d);
        customer2.setBeginUsedPackage("");
        //创建套餐信息对象
        PackageInformation packageInformation = new PackageInformation();
        //设置套餐编号
        packageInformation.setNumber("008");
        //设置通话时长为输入时长
        packageInformation.setCallDuration(callDuration);
        //设置流量为输入流量
        packageInformation.setMobileTraffic(mobileTraffic);
        if (unit==null || unit.equals("")){
            unit = "MB";
        }
        //设置流量单位
        packageInformation.setUnit(unit);
        //设置套餐月租为输入月租
        packageInformation.setMonthlyRent(monthlyRent);
        //创建两个套餐购买信息对象
        PackPurInformation packPurInformation1 = new PackPurInformation();
        PackPurInformation packPurInformation2 = new PackPurInformation();
        //设置购买人
        packPurInformation1.setPurchaser(customer1.getName());
        packPurInformation2.setPurchaser(customer2.getName());
        //设置购买日期为当天时间
        packPurInformation1.setPurchasingDate(new Date());
        packPurInformation2.setPurchasingDate(new Date());
        //设置购买套餐编号
        packPurInformation1.setPackageInformation(packageInformation.getNumber());
        packPurInformation2.setPackageInformation(packageInformation.getNumber());
        //设置支付金额为套餐月租
        packPurInformation1.setPaymentAmount(packageInformation.getMonthlyRent());
        packPurInformation2.setPaymentAmount(packageInformation.getMonthlyRent());
        //设置用户余额为余额减去月租
        customer1.setBalance(customer1.getBalance()-packageInformation.getMonthlyRent());
        customer2.setBalance(customer2.getBalance()-packageInformation.getMonthlyRent());
        //设置用户购买成功
        packPurInformation1.setIsPaySucceed(true);
        packPurInformation2.setIsPaySucceed(true);
        //设置套餐执行时间为当前日期
        packPurInformation1.setExecutionDate(new Date());
        packPurInformation2.setExecutionDate(new Date());
        System.out.println("话费分钟数和流量数量，月租！");
        System.out.println("购买人1:"+packPurInformation1.getPurchaser());
        System.out.println("购买人2:"+packPurInformation2.getPurchaser());
    }
}

