package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-12 16:25
 * @description A + B Problem. Notice that when you submit to HDU ACM online judge, change the class name to Main and do not include package line.
 */
public class Problem1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input != null && input.length() > 0) {
                String[] candidates = input.split(" ");
                long a = Long.valueOf(candidates[0]);
                long b = Long.valueOf(candidates[1]);
                System.out.println(a + b);
            }
        }
    }
}
