package test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author xiaoshijie
 * @ClassName test.Main
 * @Description 人员的姓名、年龄、性别、出生日期、银行卡余额信息
 * @date 2017/8/9
 */
public class Main {

    public static void main(String[] args) {
        //人员集合
        List<Person> personList = new ArrayList<Person>();

//        test.person p1 = new test.person("阿溪", 2, 15, new Date(), 11230.12d);
//        test.person p2 = new test.person("阿东", 1, 12, new Date(), 100d);
//        test.person p3 = new test.person("阿兰", 2, 31, new Date(), 1400.12d);
//        test.person p4 = new test.person("阿北", 1, 30, new Date(), 100.2d);
//
//        test.person persons[] = {p1, p2, p3, p4};
        //循环添加数据的条数
        int countNumInt = 4;

        //循环添加人员数据
        for (int i = 0; i < countNumInt; i++) {
            //创建人员对象
            Person person = new Person("阿溪", 1, 15, new Date(), 11230.12d);
            //判断下标为0和2的对象性别为女性
            if (i == 0 || i == 2) {
                //1-男，2-女
                person.setSex(2);
            }
            personList.add(person);
        }

        if (personList != null && personList.size() > 0) {
            //女性数量
            int wNum = 0;
            //男性数量
            int mNum = 0;
            //计算出男性数量和女性数量
            for (Person person : personList) {
                //判断性别为（1）男或者（2）女
                if (person.getSex() != null && person.getSex().intValue() == 1) {
                    mNum++;
                } else if (person.getSex() != null && person.getSex().intValue() == 2) {
                    wNum++;
                }
            }
            System.out.println("女性数量: " + wNum + "; 男性数量: " + mNum);

            //修改下标为3的人员的姓名为“刘德华”
            personList.get(3).setName("刘德华");
            //展示修改下标为3的人员的姓名为“刘德华”后的list内容
            System.out.println("展示修改下标为3的人员的姓名为“刘德华”后的人员信息:");
            for (Person person : personList) {
                System.out.println("姓名: " + person.getName()
                        + " 性别: " + person.getSex() + " 年龄: " + person.getAge()
                        + " 出生日期: " + (new SimpleDateFormat("yyyy-MM-dd")).format(person.getBirthday()) + " 银行卡余额: " + person.getMoney());
            }


            //男性人员集合
            List<Person> personList1 = new ArrayList<Person>();
            //删除男性数据
            for (int i = 0; i < personList.size(); i++) {
                Person personObj = personList.get(i);
                if (personObj.getSex() != null && personObj.getSex().intValue() == 1) {
                    personList1.add(personObj);
                }
//                System.out.println("i = "+i+"; size = "+personList.size());
            }
            personList.removeAll(personList1);

            personList.addAll(personList1);

            if (personList.contains(personList1.get(0))) {
                personList.set(3, personList1.get(0));
                System.out.println("显示下标" + personList.lastIndexOf(personList1.get(0)));

                personList.get(0).setSex(1);
                for (Person person : personList) {
                    System.out.println("姓名: " + person.getName()
                            + " 性别: " + person.getSex() + " 年龄: " + person.getAge()
                            + " 出生日期: " + (new SimpleDateFormat("yyyy-MM-dd")).format(person.getBirthday()) + " 银行卡余额: " + person.getMoney());
                }

                Comparator<Person> comparator = new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getSex().intValue() > o2.getSex().intValue() ? 1 : -1;
                    }
                };
                personList.sort(comparator);
                System.out.println("找到对应数据对象" + personList.get(3).getName());
            }
//            personList1

//            personList
            //展示男性数据被删除后的list内容
            System.out.println("展示男性数据被删除后的人员信息:");
            for (Person person : personList) {
                System.out.println("姓名: " + person.getName()
                        + " 性别: " + person.getSex() + " 年龄: " + person.getAge()
                        + " 出生日期: " + (new SimpleDateFormat("yyyy-MM-dd")).format(person.getBirthday()) + " 银行卡余额: " + person.getMoney());
            }

        }
        Person person222 = new Person("阿溪", 2, 15, new Date(), 11230.12d);
        personList.add(0,person222);
        personList.add(1,person222);
        int count=0;
        for (Person person:personList){
            if (person.getSex().intValue()==2)
            {
                count++;
                continue;
            }else if (person.getSex().intValue()==1){
                break;
            }
        }
        System.out.println(count);
    }


}
