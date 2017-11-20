package work_8_10;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_10
 * @author wangzhenxin
 * @date 2017-08-10 17:54
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * @author wangzhenxin
 * @ClassName HomeWork
 * @Description 作业
 * @date 2017-08-10
 */
public class HomeWork {
    public static void main(String[] args) {
        //创建人员集合
        List<Person> personList = new ArrayList<Person>();
        //循环添加数据的条数
        int countNumInt = 6;
        //循环添加人员信息
        for (int i = 0; i < countNumInt; i++) {
            //创建人员对象
            Person person = new Person("阿溪", 1, 15+i+2, new Date(), 11230.12d);
            personList.add(person);
        }
        //定义18岁人员数量标记
        int countPersonNumInt = 0;
        //创建小于18岁人员集合
        List<Person> personAgeList = new ArrayList<Person>();
        //遍历人员集合
        if (personList !=null &&personList.size()>0){
            for (Person person:personList) {
                //判断人员年龄
                if (person.getAge()!=null && person.getAge().intValue()>=18){
                    System.out.println("一起KTV，K歌");
                }else if (person.getAge()!=null && person.getAge().intValue()<18){
                    personAgeList.add(person);
                    System.out.println("\n姓名: " + person.getName()
                            + " 性别: " + person.getSex() + " 年龄: " + person.getAge()
                            + " 出生日期: " + (new SimpleDateFormat("yyyy-MM-dd")).format(person.getBirthday()) + " 银行卡余额: " + person.getMoney());
                    System.out.println("你未成年，不适合此活动");
                    countPersonNumInt++;
                    //判断小于18岁人员人数是否大于等于2
                    if (countPersonNumInt>=2){
                        break;
                    }
                }
            }
        }
        //如果小于18岁人员人数小于二
        if (countPersonNumInt < 2){
            //删除小于18岁人员
            personList.removeAll(personAgeList);
        }
        //对人员集合按年龄排序
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge().intValue() > o2.getAge().intValue() ?1:-1;
            }
        };
        personList.sort(comparator);
        for (Person person:personList){
            System.out.println("姓名: " + person.getName()
                    + " 性别: " + person.getSex() + " 年龄: " + person.getAge()
                    + " 出生日期: " + (new SimpleDateFormat("yyyy-MM-dd")).format(person.getBirthday())
                    + " 银行卡余额: " + person.getMoney());
        }
    }
}
