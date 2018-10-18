package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-15 18:57
 * @description As Easy As A+B
 */
public class Problem1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int lineCount = sc.nextInt();
        for (int i = 0; i < lineCount; i++) {
            int count = sc.nextInt();
            int[] candidates = new int[count];
            for (int j = 0; j < count; j++) {
                candidates[j] = sc.nextInt();
            }
            insertionSort(candidates);
        }
    }

    private static void insertionSort(int[] candidates) {
        for (int i = 1; i < candidates.length; i++) {
            int pivot = candidates[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (candidates[j] > pivot)
                    candidates[j + 1] = candidates[j];
                else
                    break;
            }
            candidates[j + 1] = pivot;
        }
        for (int i = 0; i < candidates.length; i++) {
            System.out.print(candidates[i]);
            if (i != (candidates.length - 1))
                System.out.print(" ");
        }
        System.out.println();
    }
}
