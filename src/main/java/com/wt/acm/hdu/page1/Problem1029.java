package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-16 16:44
 * @description Ignatius and the Princess IV.这题用排序应该也可以的。但效率不如遍历来得快。
 */
public class Problem1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {
            int count = sc.nextInt();
            Map<Integer, Integer> result = new HashMap<>(count * 2 / 3);
            int maxKey = -1;
            int maxNum = 0;
            for (int i = 0; i < count; i++) {
                int input = sc.nextInt();
                if (result.containsKey(input)) {
                    result.put(input, result.get(input) + 1);
                } else {
                    result.put(input, 1);
                }
                if (result.get(input) > maxNum) {
                    maxKey = input;
                    maxNum = result.get(input);
                }
            }
            System.out.println(maxKey);
        }
    }
}
