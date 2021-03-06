package com.brad.datastruct.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Description:
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-11-28 23:22
 */
public class SortUtilsTest {

    @Test
    public void insertSort() {
//        int[] a = new int[]{3,5,1,5,7,8,9,3,1,4666};
//        SortUtils.insertSort(a);
//        System.out.println(Arrays.toString(a));

        int[] b = new int[]{3,5,1,5,7,8,9,3,1,4666};
        SortUtils.Insert(b);
//        System.out.println(Arrays.toString(b));

    }

    @Test
    public void selectSort() {
//        int[] a = new int[]{3,5,1,5,7,8,9,3,1,4666};
//        SortUtils.selectSort(a);
//        System.out.println(Arrays.toString(a));

    }

    @Test
    public void mergeSort() {
        int[] a = new int[]{3,5,1,5,7,8,9,3,1,4666};
        SortUtils.mergeSort(a);
        System.out.println(Arrays.toString(a));

    }

    @Test
    public void quickSort() {
//        int[] a = new int[]{3,5,1,5,7,8,9,3,1,4666};
//        SortUtils.quickSort(a);
//        System.out.println(Arrays.toString(a));
//

        int[] a = new int[]{3,5,1,5,7,8,9,3,1,4666};
        SortUtils.quickSort2(a);
        System.out.println(Arrays.toString(a));

    }
}