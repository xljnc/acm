package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author Xljnc
 * @date 2018/10/13 23:49
 * @description Max Sum
 */
public class Problem1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {
            int count = sc.nextInt();
            for (int i = 1; i <= count; i++) {
                int lineCount = sc.nextInt();
                int[] candidates = new int[lineCount];
                for (int j = 0; j < lineCount; j++) {
                    candidates[j] = sc.nextInt();
                }
                int maxSum = -1000, tempSum = 0, start = 0, end = 0;
                //这里是算法重点
                //先计算最大子串的值
                for (int j = 0; j < lineCount; j++) {
                    tempSum += candidates[j];
                    if (tempSum > maxSum) {
                        maxSum = tempSum;
                        end = j;
                    }
                    //如果和为副数，则说明从开始为到当前位的子串没有意义
                    if (tempSum < 0)
                        tempSum = 0;
                }
                tempSum = 0;
                //从截止位置往前推断开始位
                for (int j = end; j >= 0; j--) {
                    tempSum += candidates[j];
                    if (tempSum == maxSum)
                        start = j;
                }
                System.out.println("Case " + i + ":");
                System.out.println(maxSum + " " + (start + 1) + " " + (end + 1));
                if (i != count)
                    System.out.println();
            }
        }
    }

}
