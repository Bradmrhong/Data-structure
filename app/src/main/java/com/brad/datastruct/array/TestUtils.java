package com.brad.datastruct.array;

import android.text.TextUtils;

/**
 * Description:
 *
 * @author Brad <mailto:brad.hong@bindo.com>
 * @version 1.0
 * @since 2020/4/22 9:31 PM
 */
public class TestUtils {


    public static int test(int n, String str ) {
        System.out.println("start test");
        if (str == null || str == "" || str.length() != 1) {
            System.out.println(-1);
        }

        char c = str.charAt(0);
        if (c < '0' || c > '9') {
            System.out.println(-1);
        }

        int absN = Math.abs(n);
        int ret = 0;
        for (int i = 1; i <= absN; i++) {
            ret += countOfValue(i, c);
        }
        System.out.println(ret);
        return ret;
    }

    private static int countOfValue(int value, char c) {
        String strValue = String.valueOf(value);
        int count = 0;
        for (int i = 0; i < strValue.length(); i++) {
            if (strValue.charAt(i) == c) {
                count ++;
            }
        }
        return count;
    }
}
