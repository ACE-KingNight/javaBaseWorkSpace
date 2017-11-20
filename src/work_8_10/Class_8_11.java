package work_8_10;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package work_8_10
 * @author wangzhenxin
 * @date 2017-08-11 14:17
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */


import java.util.Arrays;
import java.util.List;

/**
 * @author wangzhenxin
 * @ClassName Class_8_11
 * @Description 类描述
 * @date 2017-08-11
 */
public class Class_8_11 {
    public static void main(String[] args) {
        Person[] persons={new Person(),new Person(),new Person()};
        Person[] persons1=new Person[]{new Person(),new Person()};
        Person[] persons2=new Person[3];

        Boolean[] booleans={null,null,null};
        Boolean[] booleans1=new Boolean[]{true,false,true};
        Boolean[] booleans2=new Boolean[3];

        String[] strings={"a",null,null,"e"};
        String[] strings1=new String[]{"a",null,null,"e"};
        String[] strings2=new String[4];
        strings2[0]="a";
        strings2[3]="e";
//        System.out.println(strings2[2]);
        int countSumInt = 0;
        int maxInt = 0;
        int[] ints=new int[]{1,2,3,4,5,10,6,7,8,9};

        int[][] ints1 = new int[][]{{1,5,6},{1,5,6,7,8},{6,5,6,8}};
        for (int i = 0; i <ints1.length ; i++) {
            System.out.println("");
            for (int j = 0; j <ints1[i].length ; j++) {
                System.out.print(ints1[i][j]);
            }
        }
        for (int i=0; i<ints.length;i++){
            countSumInt = countSumInt + ints[i];
            if (ints[i]>maxInt){
                maxInt = ints[i];
            }
        }
        System.out.println("\n和为:"+countSumInt+"\n最大值为:"+maxInt);
        Arrays.sort(ints);
        System.out.println(Arrays.binarySearch(ints,3));
        //数组转换为对应类型的集合
        List<Person> personList = Arrays.asList(persons1);


        //集合转换为object类
        Object[] objects = personList.toArray();
        //object类强制转换为Person类型
        persons2 = (Person []) objects;


        //将personList集合转换为persons2类型的数组
        personList.toArray(persons2);

    }
}
