package com.brad.datastruct.recursion;

import java.util.HashMap;

/**
 * Description: 实现斐波那契数列
 * F[n]=F[n-1]+F[n-2] n>=3
 * F[1]=1,F[2]=1
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020/5/6 8:07 PM
 */
public class Fibonacci {

    static HashMap<Integer, Integer> existed = new HashMap<>();

    /**
     * 最终做法
     * 当N比较大时，不采用递归
     * 为了避免递归产生的重复运算，采用hash表存储
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n > 20000) {
            return fibonacci2(n);
        }
        if (n < 0) return Integer.MIN_VALUE;
        if (n == 0) return 0;
        if (n == 2 || n == 1) return 1;
        if (existed.containsKey(n)) {
            return existed.get(n);
        }
        int ret = fibonacci(n-1) + fibonacci(n-2);
        existed.put(n, ret);
        return ret;
    }

    public static int fibonacci2(int n) {
        if (n < 0) return Integer.MIN_VALUE;
        if (n == 0) return 0;
        if (n == 2 || n == 1) return 1;

        int a = 1, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

}
