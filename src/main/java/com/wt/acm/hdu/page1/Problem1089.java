package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-15 13:01
 * @description A+B for Input-Output Practice (I)。这题目也是惊人，竟然连数据类型是否会超过范围都不需要检查。。也用不到BigDecimal
 */
public class Problem1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
//            BigDecimal a = new BigDecimal(sc.next());
//            BigDecimal b = new BigDecimal(sc.next());
//            System.out.println(a.add(b));
        }
    }
}
