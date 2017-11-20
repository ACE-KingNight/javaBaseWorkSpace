package work_8_11;/********************************************************************
 /**
 * @Project: JavaWorkSpaces
 * @Package testsum
 * @author wangzhenxin
 * @date 2017-08-10 15:42
 * @Copyright: 2017 www.zyht.com Inc. All rights reserved.
 * @version V1.0
 */

/**
 * @author wangzhenxin
 * @ClassName Trapezoid
 * @Description 梯形类
 * @date 2017-08-10
 */
public class Trapezoid {
    public static void main(String[] args) {
        //定义字符串数组
        String[][] strings = new String[][]{{"*","*","*"},{"*","*","*","*","*"},{"*","*","*","*","*","*","*"},{"*","*","@","@","@","@","@","*","*"},{"*","*","*","*","@","@","@","*","*","*","*"},{"*","*","*","*","*","*","@","*","*","*","*","*","*"},{"*","*","*","*","*","*","*","*","*","*","*","*","*","*","*"}};

        for (int i = 0; i < strings.length ; i++) {
            for (int j=0;j<7-i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < strings[i].length ; j++){
                System.out.print(strings[i][j]);
            }
            System.out.println("");
        }
    }
}
