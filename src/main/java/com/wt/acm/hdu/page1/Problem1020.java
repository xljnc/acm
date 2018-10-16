package com.wt.acm.hdu.page1;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-16 18:00
 * @description Encoding
 */
public class Problem1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int lineCount = sc.nextInt();
        for (int i = 0; i < lineCount; i++) {
            char[] input = sc.next().toCharArray();
            char currChar = input[0];
            int sum = 1;
            StringBuilder result = new StringBuilder();
            for (int j = 1; j < input.length; j++) {
                if (input[j] == currChar) {
                    sum++;
                } else {
                    if (sum == 1)
                        result.append(currChar);
                    else
                        result.append(sum).append(currChar);
                    currChar = input[j];
                    sum = 1;
                }
            }
            if (sum == 1)
                result.append(currChar);
            else
                result.append(sum).append(currChar);
            System.out.println(result.toString());
        }


    }
}
