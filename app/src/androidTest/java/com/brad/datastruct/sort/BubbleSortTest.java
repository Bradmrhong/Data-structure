package com.brad.datastruct.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Description:
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-28 18:37
 */
public class BubbleSortTest {
    @Test
    public void sort() {
        int[] a = new int[]{3,5,1,5,7,8,9,3,1,4666};
        BubbleSort.bigBubbleDown(a);
        System.out.println(Arrays.toString(a));

        a = new int[]{3,5,1,5,7,8,9,3,1,4666};
        BubbleSort.smallBubbleUp(a);
        System.out.println(Arrays.toString(a));

    }

}