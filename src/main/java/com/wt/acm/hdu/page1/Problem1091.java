package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-15 13:52
 * @description A+B for Input-Output Practice (III)
 */
public class Problem1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (s1.equals("0") && s2.equals("0")) {
                break;
            }
            BigDecimal a = new BigDecimal(s1);
            BigDecimal b = new BigDecimal(s2);
            System.out.println(a.add(b));
        }
    }
}
