package com.wt.acm.hdu.page3;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-19 17:29
 * @description 统计同成绩学生人数
 */
public class Problem1235 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int[] scores;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0)
                return;
            scores = new int[n];
            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (scores[i] == target)
                    sum++;
            }
            System.out.println(sum);
        }
    }
}
