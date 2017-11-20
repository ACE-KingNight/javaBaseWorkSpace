package work_8_11;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_11
 * @author wangzhenxin
 * @date 2017-08-11 21:17
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @author wangzhenxin
 * @ClassName Service
 * @Description 类描述
 * @date 2017-08-11
 */
public class Service {


    public static void main(String[] args) {
        /**
         * @Title: 业务主方法
         * @Description: 完成业务
         * @author wangzhenxin
         * @date 2017-08-14
         */
        //创建快递员对象
        Courier courier = new Courier("张三","m",25,183,"本科","620415198606470318","17612154675");
        Courier courier1 = new Courier("李四","f",36,167,"大专","620415198606470318","17612154675");
        Courier courier2 = new Courier("王五","m",29,177,"硕士","620415198606470318","17612154675");
        //创建物品数组
        Goods goods[] = new Goods[3];
        Goods goods1 = new Goods("手机","成都","赵六","17525939135",new Date(),6880.00d,false,new Date());
        Goods goods2 = new Goods("电脑","双流","赵六","17525939135",new Date(),7841.00d,false,new Date());
        Goods goods3 = new Goods("鼠标","高新","赵六","17525939135",new Date(),125.00d,false,new Date());
        goods[0] = goods1;
        goods[1] = goods2;
        goods[2] = goods3;

        //创建一个新的快递员
        Courier courier3 = new Courier();
        //产生一个0-3之间的随机数
        int randomNumInt = new Random().nextInt(3);
        //修改随机命中目标状态为true
        goods[randomNumInt].setIs_receiver(true);
        //更新命中目标收件日期
        goods[randomNumInt].setReceiver_time(new Date());
        //打印命中目标状态
        System.out.println("商品名称:"+goods[randomNumInt].getName());
        System.out.println("收件状态:"+goods[randomNumInt].getIs_receiver());
        //设置时间输出格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //定义日历对象
        Calendar calendar = Calendar.getInstance();
        //获取收件日期赋与日历对象
        calendar.setTime(goods[randomNumInt].getReceiver_time());
        //将是将转换为字符串
        String show_time = simpleDateFormat.format(calendar.getTime());
        //定义当前星期数
        int week = calendar.get(Calendar.DAY_OF_WEEK)-1;
        //判断如果当前日为0则当前星期为周日
        if (week==0)
        {
            week = 7;
        }
        //定义当前为全年第几周
        int week_year = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("收件日期:"+show_time+" "+"全年第"+ week_year +"周"+" 星期"+week);
        //从数组中删除命中目标
        goods = delete(goods,randomNumInt);
        //定义未标记产品价格总和
        double countMoneyDou =0d;
        //循环求总金额
        for (int i = 0; i < goods.length; i++) {
            if (goods[i].getIs_receiver().booleanValue()==false){
                countMoneyDou = countMoneyDou+goods[i].getMoney().doubleValue();
            }
        }
        System.out.println("总金额为:"+countMoneyDou);
    }
    //数组的删除元素方法
    public static Goods[] delete(Goods a[], int index) {
        //定义临时对象数组
        Goods btemporary[] = new Goods[a.length - 1];
        //循环替换传入数组的值
        for (int i = 0; i < btemporary.length; i++) {
            if (i <= index - 1) {
                btemporary[i] = a[i];
            } else {
                btemporary[i] = a[i+1];
            }
        }
        return btemporary;
    }
}
