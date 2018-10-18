package com.wt.acm.hdu.page3;

import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-18 17:08
 * @description A + B
 */
public class Problem1228 {
    public static void main(String[] args) {
        Map<String, Integer> digitals = new HashMap<>(16);
        digitals.put("zero", 0);
        digitals.put("one", 1);
        digitals.put("two", 2);
        digitals.put("three", 3);
        digitals.put("four", 4);
        digitals.put("five", 5);
        digitals.put("six", 6);
        digitals.put("seven", 7);
        digitals.put("eight", 8);
        digitals.put("nine", 9);
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()) {
            String input = sc.nextLine();
            int plusIndex = input.indexOf("+");
            int equalsIndex = input.indexOf("=");
            String[] lefts = input.substring(0, plusIndex - 1).split(" ");
            String[] rights = input.substring(plusIndex + 2, equalsIndex - 1).split(" ");
            int left = 0;
            if (lefts.length == 1)
                left = digitals.get(lefts[0]);
            else
                left = 10 * digitals.get(lefts[0]) + digitals.get(lefts[1]);
            int right = 0;
            if (rights.length == 1)
                right = digitals.get(rights[0]);
            else
                right = 10 * digitals.get(rights[0]) + digitals.get(rights[1]);
            if (left == 0 && right == 0)
                break;
            System.out.println(left + right);
        }

    }
}
