package com.wt.acm.hdu.page3;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-19 17:17
 * @description 七夕节
 */
public class Problem1215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int lineCount = sc.nextInt();
        for (int i = 0; i < lineCount; i++) {
            int input = sc.nextInt();
            int sum = 0;
            for (int j = 1; j * j <= input; j++) {
                if (input % j == 0) {
                    sum += j;
                    int temp = input / j;
                    if (temp != j && temp != input)
                        sum += temp;
                }
            }
            System.out.println(sum);
        }

    }
}
