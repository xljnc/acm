package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-15 14:46
 * @description A hard puzzle.有2种处理方法。
 */
public class Problem1097 {
    private static int[][] results = {{0, 0, 0, 0}, {1, 1, 1, 1}, {2, 4, 8, 6}, {3, 9, 7, 1}, {4, 6, 4, 6}, {5, 5, 5, 5}, {6, 6, 6, 6}, {7, 9, 3, 1}, {8, 4, 2, 6}, {9, 1, 9, 1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            //enumDisplay(a, b);
            quickPow(a,b);
        }
    }

    private static void enumDisplay(int a, int b) {
        a %= 10;
        b = (b % 4 == 0 ? 3 : (b % 4 - 1));
        System.out.println(results[a][b]);
    }

    private static void quickPow(int a, int b) {
        a %= 10;
        b = (b % 4 == 0 ? 4 : (b % 4));
        while (b != 1) {
            if (b % 2 == 0) {
                a = a * a % 10;
            } else {
                a = a * a * a % 10;
            }
            b = b >> 1;
        }
        System.out.println(a);
    }
}
