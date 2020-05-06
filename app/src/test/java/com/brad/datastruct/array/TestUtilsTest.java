package com.brad.datastruct.array;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Description:
 *
 * @author Brad <mailto:brad.hong@bindo.com>
 * @version 1.0
 * @since 2020/4/22 9:32 PM
 */
public class TestUtilsTest {

    @Test
    public void test() {
        int[] origin = new int[] {10, -2, 5, 8, -4, 2, -3, 7, 12, -88, -23, 35};
        int[] result = new int[] {-2, -4, -3, -88, -23, 10, 5, 8, 2, 7, 12, 35};
        assertEquals(TestUtils.test(12, "1"), 5);
    }
}