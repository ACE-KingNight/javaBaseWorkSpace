package mobile_package.service;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package mobile_package.service
 * @author wangzhenxin
 * @date 2017-08-17 18:18
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import mobile_package.entity.CallRecords;
import mobile_package.entity.Customer;

import java.util.Date;

/**
 * @author wangzhenxin
 * @ClassName CallServiceImpl
 * @Description 拨打电话方法实现
 * @date 2017-08-17
 */
public class CallServiceImpl implements CallService {
    /**
     * @Title: call
     * @Description: 打电话方法
     * @author wangzhenxin
     * @date 2017-08-17
     * @param callCustomer 打电话者
     * @param phoneCode    电话号码
     */
    @Override
    public void call(Customer callCustomer, String phoneCode) {
        //创建拨打电话通话记录
        CallRecords callRecords = new CallRecords();
        //创建接听对象
        Customer answerCustomer = new Customer();
        //定义客户service
        CustomerService customerService = new CustomerServiceImpl();
        //根据电话号码查找对应的客户
        answerCustomer = customerService.findCustomerByPhoneCode(phoneCode);
        //设置通话记录拨打者信息
        callRecords.setCallCustomer(callCustomer);
        //设置通话记录接听者信息
        callRecords.setAnswerCustomer(answerCustomer);
        //设置通话记录为拨打者
        callRecords.setDialType(CallRecords.CALL);
        //设置通话类型为本地通话
        callRecords.setCallType(CallRecords.LOCAL_CONNECTION);
        //向接听者发送信息
//        Integer isAnswer = answer(callRecords,callCustomer,answerCustomer,callCustomer.getPhoneCode());
        //设置接听状态为接听
        callRecords.setIsAnswer(true);
        //创建接听电话通话记录
        CallRecords answerRecords = new CallRecords();
        //设置通话记录拨打者信息
        answerRecords.setCallCustomer(callCustomer);
        //设置通话记录接听者信息
        answerRecords.setAnswerCustomer(answerCustomer);
        //设置通话记录为接听者
        answerRecords.setDialType(CallRecords.ANSWER);
        //设置开始通话时间
        callRecords.setStartCallTime(new Date());
        answerRecords.setStartCallTime(new Date());
        //设置通话结束时间
        callRecords.setEndCallTime(new Date());
        answerRecords.setEndCallTime(new Date());
        //定义通话时长
        long callDuration = (callRecords.getEndCallTime().getTime() - callRecords.getStartCallTime().getTime()) / 1000;
        //根据通话类型计算通话资费
        switch (callRecords.getCallType().intValue()) {
            //本地通话
            case 1:
                //设置资费
                callRecords.setConsumption(callDuration * CallRecords.LOCAL_CONNECTION_MONEY.doubleValue());
                //扣除拨打者交费费用
                callCustomer.setBalance(callCustomer.getBalance().doubleValue() - callRecords.getConsumption().doubleValue());
                break;
            //长途通话
            case 2:
                //设置资费
                callRecords.setConsumption(callDuration * CallRecords.LONG_TOLL_CALL_MONEY.doubleValue());
                //扣除拨打者交费费用
                callCustomer.setBalance(callCustomer.getBalance().doubleValue() - callRecords.getConsumption().doubleValue());
                break;
            case 3:
                //设置资费
                callRecords.setConsumption(callDuration * CallRecords.ROAMING_CALLS_MONEY.doubleValue());
                //扣除拨打者交费费用
                callCustomer.setBalance(callCustomer.getBalance().doubleValue() - callRecords.getConsumption().doubleValue());
                break;
        }
        //定义通话记录服务
        CallRecordsService callRecordsService = new CallRecordsServiceImpl();
        //更新通话记录
        callRecordsService.updateCallRecordsByCallRecords(callRecords);
        callRecordsService.updateCallRecordsByCallRecords(answerRecords);

    }
}

//    @Override
//    public Integer answer(CallRecords callRecords,Customer callCustomer,Customer answerCustomer, String phoneCode) {
//        System.out.println(callCustomer.getName()+"来电"+"\n电话号码为:"+phoneCode);
//        //如果不接听
//        //return 0;
//        //如果接听
//        //创建接听电话通话记录
//        CallRecords answerRecords = new CallRecords();
//        //设置通话记录拨打者信息
//        answerRecords.setCallCustomerId(callCustomer);
//        //设置通话记录接听者信息
//        answerRecords.setAnswerCustomerId(answerCustomer);
//        //设置通话记录为接听者
//        answerRecords.setDialType(CallRecords.ANSWER);
//
//        return 1;
//    }
//}
