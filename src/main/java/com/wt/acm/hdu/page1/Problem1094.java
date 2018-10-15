package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-15 14:19
 * @description A+B for Input-Output Practice (VI)
 */
public class Problem1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while(sc.hasNext()) {
            int count = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < count; j++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
