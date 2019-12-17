package com.brad.datastruct.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description:
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-12-10 17:24
 */
public class ArrayUitlsTest {

    @Test
    public void moveNagetiveDigitsToLetf() {
        int[] origin = new int[] {10, -2, 5, 8, -4, 2, -3, 7, 12, -88, -23, 35};
        int[] result = new int[] {-2, -4, -3, -88, -23, 10, 5, 8, 2, 7, 12, 35};
        assertArrayEquals(ArrayUitls.moveNagetiveDigitsToLetf(origin), result);
    }
}