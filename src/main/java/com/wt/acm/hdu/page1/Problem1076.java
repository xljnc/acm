package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-17 9:19
 * @description An Easy Task
 */
public class Problem1076 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int lineCount = sc.nextInt();
        for (int i = 0; i < lineCount; i++) {
            int startYear = sc.nextInt();
            int n = sc.nextInt();
            int count = 0;
            int j = startYear;
            while (j > 0) {
                if (isLeapYear(j))
                    count++;
                if (count == n)
                    break;
                j++;
            }
            System.out.println(j);
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
