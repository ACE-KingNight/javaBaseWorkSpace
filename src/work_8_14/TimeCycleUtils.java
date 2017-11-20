package work_8_14;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_14
 * @author wangzhenxin
 * @date 2017-08-14 17:51
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author wangzhenxin
 * @ClassName TimeCycleUtils
 * @Description 时间转换帮助类
 * @date 2017-08-14
 */
public class TimeCycleUtils {

    /*
    * 年月日格式
    */
    public static final String YEAR_MONTH_DAY="yyyy-MM-dd";
    /**
     * 年月日时分秒
     */
    public static final String YEAR_MONTH_DAY_HOUR_MIN_SEC = "yyyy-MM-dd HH:mm:ss";
    /**
     * @Title: timeFormat
     * @Description: 指定时间转化制定格式类型
     * @author wangzhenxin
     * @date 2017-08-14
     * @return Date
     * @param time 指定时间
     * @param timeFormat 指定时间格式
     */

    public static Date timeFormat(String time,String timeFormat){
        //判断用户输入时间是否为空
        if (time == null || time.equals("")) {
            System.out.println("请输入时间！！");
            return null;
        }
        //定义时间格式转换对象
        SimpleDateFormat simpleDateFormat = null;
        //判断时间格式
        if(timeFormat == null || timeFormat.equals("")) {
             simpleDateFormat = new SimpleDateFormat(YEAR_MONTH_DAY);
        }else {
            simpleDateFormat = new SimpleDateFormat(timeFormat);
        }
        //定义时间对象
        Date date = new Date();
        try {
            //将字符串转换为时间格式
             date = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("指定时间格式为:"+timeFormat+"对应时间为:"+simpleDateFormat.format(date));
        return date;
    }

    /**
     * @Title: timeForMonth
     * @Description: 指定时间取制定时间的月份
     * @author wangzhenxin
     * @date 2017-08-14
     * @return Integer 月份
     * @param time 指定时间
     */

    public static Integer timeForMonth(String time){
        //判断用户输入时间是否为空
        if (time == null || time.equals("")) {
            System.out.println("请输入时间！！");
            return null;
        }
        //定义时间格式转换对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(YEAR_MONTH_DAY);
        //定义时间对象
        Date date = new Date();
        try {
            //将字符串转换为时间格式
            date = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //定义月份数
        Integer monthInteger;
        //定义日历对象
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //获取当前月加1
        monthInteger = calendar.get(Calendar.MONTH)+1;
        System.out.println("当前月份为:"+monthInteger+"月");
        //返回当前月份
        return monthInteger;
    }

    /**
     * @Title: timeForWeek
     * @Description: 指定时间取其上一周星期5的时间
     * @author wangzhenxin
     * @date 2017-08-14
     * @return Date 转换后的时间
     * @param time 指定时间 timeFormat 指定时间格式
     */

    public static Date timeForWeek(String time,String timeFormat){
        //定义时间对象
        Date date =  timeFormat(time,timeFormat);

        //判断用户输入时间是否为空
        if (time == null || time.equals("")) {
            System.out.println("请输入时间！！");
            return null;
        }
        //定义时间格式转换对象
        SimpleDateFormat simpleDateFormat = null;
        //判断时间格式
        if(timeFormat == null || timeFormat.equals("")) {
            simpleDateFormat = new SimpleDateFormat(YEAR_MONTH_DAY);
        }else {
            simpleDateFormat = new SimpleDateFormat(timeFormat);
        }
        //定义日历对象
        Calendar calendar = Calendar.getInstance();
        //日历对象赋值
        calendar.setTime(date);
        //获取当前为全月第几周，并向前设置一周
        calendar.add(Calendar.WEEK_OF_MONTH, -1);
        //定义周数
        int weekMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        //获取当天为本周第几天
        int dayWeek = calendar.get(Calendar.DAY_OF_WEEK);
        //如果当天为本周周末，则设置日期减1按周六计算，否则会计算结果不对
        if (1 == dayWeek) {
            calendar.add(Calendar.DAY_OF_MONTH, -1);
        }
        // 获得当前日期是一个星期的第几天
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        //获取没后第一天
        int first = calendar.getFirstDayOfWeek();
        // 计算周五的日期
        calendar.add(Calendar.DAY_OF_WEEK, first - day + 5);
        //获取周几
        int weekday = calendar.get(Calendar.DAY_OF_WEEK)-1;
        if (weekday == 0){
            weekday = 7;
        }
        System.out.println("修改后的时间为:"+simpleDateFormat.format(calendar.getTime())+"当月第"+weekMonth+"周"+"星期"+weekday);
        //返回转换后的时间
        return  date;
    }
}
