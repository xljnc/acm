package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-16 18:43
 * @description Fibonacci Again
 */
public class Problem1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        String[] results = {"no","no","yes","no","no","no","yes","no"};
        while(sc.hasNext()){
            int num = sc.nextInt();
            System.out.println(results[num%8]);
        }
    }
}
