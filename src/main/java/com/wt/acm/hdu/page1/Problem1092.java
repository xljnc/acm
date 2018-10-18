package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-15 14:06
 * @description A+B for Input-Output Practice (IV)
 */
public class Problem1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {
            int count = sc.nextInt();
            if (count == 0) {
                break;
            }
            int sum = 0;
            for (int i = 0; i < count; i++) {
                sum+= sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
