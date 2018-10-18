package com.wt.acm.hdu.page3;

import java.io.BufferedInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author WuTian
 * @date 2018-10-18 11:39
 * @description 18岁生日。 格式必须是yyyy-MM-dd，否则解析有误。
 */
public class Problem1201 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int lineCount = sc.nextInt();
        for (int i = 0; i < lineCount; i++) {
            String input = sc.next();
            System.out.println(getBirthDays(input));
        }
    }

    private static long getBirthDays(String input) throws ParseException {
        Date birthday = stringToDate(input);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birthday);
        int birthMonth = calendar.get(Calendar.MONTH);
        int birthDay = calendar.get(Calendar.DAY_OF_MONTH);
        if (birthMonth == 1 && birthDay == 29)
            return -1L;
        long start = calendar.getTimeInMillis();
        calendar.add(Calendar.YEAR, 18);
        long end = calendar.getTimeInMillis();
        return (end - start) / (1000 * 60 * 60 * 24);
    }

    private static Date stringToDate(String input) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(input);
    }
}
