package map_set_list;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package map_set_list
 * @author wangzhenxin
 * @date 2017-08-24 16:51
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

import java.util.*;

/**
 * @author wangzhenxin
 * @ClassName test
 * @Description 类描述
 * @date 2017-08-24
 */
public class test {
    /**
     * @author wangzhenxin
     * @ClassName Test
     * @Description 测试类
     * @date 2017-08-17
     */
    public static void main(String[] args) {
//        CustomerService customerService = new CustomerServiceImpl();
//        Customer customer = new Customer();
//        customerService.updateCustomerByCustomer(customer);
//        CallRecordsService callRecordsService = new CallRecordsServiceImpl();
//        CallRecords callRecords = null;
//        callRecordsService.updateCallRecordsByCallRecords(callRecords);
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(15);
        integerList.add(2);
        integerList.add(30);
        integerList.add(8);
        integerList.add(5);

        Iterator<Integer> integerIterator = integerList.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
        Collections.sort(integerList);
        System.out.println(integerList);

        List<Object> objectList = new Vector<Object>();
        objectList.add(1);
        System.out.println(objectList.get(0));

        Set<Object> objectSet = new HashSet<Object>();
        objectSet.add(1);
        objectSet.add(2);
        SortedSet<Object> objectSortedSet = new TreeSet<Object>();
        objectSortedSet.add(45);
        objectSortedSet.add(5);
        objectSortedSet.add(123);
        objectSortedSet.add(777);
        Iterator<Object> objectIterator = objectSortedSet.iterator();
        while (objectIterator.hasNext()) {
            System.out.println(objectIterator.next());
        }
        Map<String, Object> objectMap = new HashMap<String, Object>();
        AbstractMap<String, Object> objectAbstractMap =new TreeMap<String, Object>();
        Map<String,Object> sadStringObjectMap = new Hashtable<String, Object>();
        SortedMap<String, Object> stringObjectSortedMap = new TreeMap<String, Object>();
        Map<Object,Object> sadObjectObjectMap = new IdentityHashMap<Object, Object>();
        stringObjectSortedMap.put("11",11);
        stringObjectSortedMap.put("154",154);
        stringObjectSortedMap.put("20",20);
        stringObjectSortedMap.put("17",17);
        Set<String> strings = stringObjectSortedMap.keySet();
        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringObjectSortedMap.get(stringIterator.next()));
        }


//        objectMap.put("1", 25);
//        objectMap.put("sad", 33);
//        System.out.println(objectMap.get("sad"));
//
//        //将map的key放入一个StringSet用于查询
//        Set<String> stringSet = objectMap.keySet();
//        //将keySet放入迭代器
////        Iterator<String> stringIterator = stringSet.iterator();
//        //循环
//        while (stringIterator.hasNext()) {
//            //根据key取出value的值
//            System.out.println("values=" + objectMap.get(stringIterator.next()));
//        }
//
//        //将map转换为map入口对象
//        Set<Map.Entry<String, Object>> entrySet = objectMap.entrySet();
//        //将map入口对象装入迭代器
//        Iterator<Map.Entry<String, Object>> entryIterator = entrySet.iterator();
//        //迭代map
//        while (entryIterator.hasNext()) {
//            Map.Entry<String, Object> objectEntry = entryIterator.next();
//            System.out.println("key=" + objectEntry.getKey() + " values=" + objectEntry.getValue());
//        }
    }
}
