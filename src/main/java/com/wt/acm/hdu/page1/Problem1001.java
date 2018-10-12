package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-12 16:53
 * @description Sum Problem
 */
public class Problem1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNextLong()) {
            long input = sc.nextInt();
            System.out.println((1 + input) * input / 2);
            System.out.println();
        }
    }
}
