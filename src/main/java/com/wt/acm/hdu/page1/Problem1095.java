package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-15 14:24
 * @description A+B for Input-Output Practice (VII)
 */
public class Problem1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
            System.out.println();
        }
    }
}
