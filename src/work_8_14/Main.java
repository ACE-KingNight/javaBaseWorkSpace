package work_8_14;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_14
 * @author wangzhenxin
 * @date 2017-08-14 16:56
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangzhenxin
 * @ClassName Main
 * @Description 类描述
 * @date 2017-08-14
 */
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TimeCycleUtils.YEAR_MONTH_DAY);
        Date date = new Date();
        System.out.println(date);
        System.out.println(simpleDateFormat.format(date));
        TimeCycleUtils.timeFormat("2013-06-01",null);
        TimeCycleUtils.timeForWeek("2013-06-01 13:24:16", TimeCycleUtils.YEAR_MONTH_DAY_HOUR_MIN_SEC);
        TimeCycleUtils.timeForMonth("2013-06-01");
    }
}
