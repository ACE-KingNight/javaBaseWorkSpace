package testsum;/********************************************************************
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
        for (int i=0;i<7;i++){
            if (i<=2 || i > 5){
                for (int k=0;k<7-i;k++)
                {
                    System.out.print(" ");
                }
            }
            if (i == 2) {
                for (int j = 0; j < 4; j++) {
                    if (j>0) {
                        for (int k = 0; k <5-j ; k++) {
                            System.out.print(" ");
                        }
                    }
                    for (int k = 0; k <2*j+1 ; k++) {
                        System.out.print("*");
                    }
                    for (int k = 0; k <3-j ; k++) {
                        System.out.print("@");
                    }
                    System.out.print("@");
                    for (int k = 0; k <3-j ; k++) {
                        System.out.print("@");
                    }
                    for (int k = 0; k <2*j+1 ; k++) {
                        System.out.print("*");
                    }
                    if (j<3){
                        System.out.println("");
                    }
                }
            }else if (i>2 && i<=5){
                continue;
            }else {
                for (int j=0;j<i*2+5;j++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
