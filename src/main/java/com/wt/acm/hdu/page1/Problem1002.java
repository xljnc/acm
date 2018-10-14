package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Xljnc
 * @date 2018/10/13 17:40
 * @description A + B Problem II
 */
public class Problem1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            BigDecimal a = sc.nextBigDecimal();
            BigDecimal b = sc.nextBigDecimal();
            if(i!=1)
                System.out.println();
            System.out.println("Case " + i + ":");
            System.out.println(a + " + " + b + " = " + (a.add(b)));
        }

    }
}
