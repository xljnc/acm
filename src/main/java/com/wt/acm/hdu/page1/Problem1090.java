package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-15 13:44
 * @description A+B for Input-Output Practice (II).
 */
public class Problem1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int lineCount = sc.nextInt();
        for (int i = 0; i < lineCount; i++) {
            BigDecimal a = new BigDecimal(sc.next());
            BigDecimal b = new BigDecimal(sc.next());
            System.out.println(a.add(b));
        }
    }
}
