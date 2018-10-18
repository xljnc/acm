package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-16 17:43
 * @description N!
 */
public class Problem1042 {
    private static BigDecimal[] results = new BigDecimal[10000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {
            int input = sc.nextInt();
            System.out.println(factorial(input));
        }
    }

    public static BigDecimal factorial(int input) {
        if (input == 0)
            return BigDecimal.ONE;
        if (input == 1) {
            results[0] = BigDecimal.ONE;
            return results[0];
        }
        if (results[input - 1] != null)
            return results[input - 1];
        else {
            BigDecimal result = BigDecimal.valueOf(input).multiply(factorial(input - 1));
            results[input - 1] = result;
            return result;
        }
    }

}
