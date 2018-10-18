package com.wt.acm.hdu.page3;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-18 17:34
 * @description 还是A+B
 */
public class Problem1229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            if (a == 0 && b == 0)
                break;
            System.out.println(calculate(a, b, k));
        }
    }

    private static int calculate(int a, int b, int k) {
        return a % Math.pow(10, k) == b % Math.pow(10, k) ? -1 : (a + b);
    }

//    private static boolean equal(int a, int b, int k) {
//        String strA = a + "";
//        String strB = b + "";
//        String subA = getTail(strA, k);
//        String subB = getTail(strB, k);
//        return subA.equals(subB);
//    }
//
//    private static String getTail(String input, int k) {
//        String result;
//        if (input.length() < k) {
//            result = input;
//            for (int i = 0; i < (k - input.length()); i++) {
//                result = "0" + result;
//            }
//        } else {
//            result = input.substring(input.length() - k);
//        }
//        return result;
//    }

}
