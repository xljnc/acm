package com.wt.acm.hdu.page11;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-15 17:50
 * @description 求绝对值
 */
public class Problem2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while(sc.hasNext()){
            double d = sc.nextDouble();
            System.out.println(String.format("%.2f",Math.abs(d)));
        }
    }
}
