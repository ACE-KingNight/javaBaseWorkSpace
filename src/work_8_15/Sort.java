package work_8_15;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_15
 * @author wangzhenxin
 * @date 2017-08-15 17:03
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Sort
 * @Description 类描述
 * @date 2017-08-15
 */
public class Sort {
    public static void main(String[] args) {
        int[] ints = {1,456,9,7,8,7,9,8,1111,115,5};
        System.out.println("排序前数组");
        for (int i = 0; i <ints.length ; i++) {
            System.out.print(ints[i]+",");
        }
        Sort.bubbleSort(ints);
        System.out.println("\n排序后数组");
        for (int i = 0; i <ints.length ; i++) {
            System.out.print(ints[i] +",");
        }
        //创建促销对象
        SalesPromotion salesPromotion = new SalesPromotion();
        //根据套餐短信数和分钟数促销
        salesPromotion.sale(200,420);
        //根据彩铃和月租促销
        salesPromotion.sale(true,34d);
        //话费分钟数和流量数量，月租促销
        salesPromotion.sale(200,500,"MB",88d);

    }
    public static void bubbleSort(int ints[]) {

        int length = ints.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i+1; j < length; j++) {
                if (ints[i] > ints[j]) {
                    int iTmp = ints[j];
                    ints[j] = ints[i];
                    ints[i] = iTmp;
                }

            }
        }

    }
}
