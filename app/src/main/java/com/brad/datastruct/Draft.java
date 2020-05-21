package com.brad.datastruct;

import android.media.midi.MidiDevice;

import com.brad.datastruct.sort.BubbleSort;

import java.security.Key;

/**
 * Description:
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2020/5/20 12:24 PM
 */
public class Draft {

    public static void bubbleSort(int[] a) {
        if (a == null || a.length < 2) {
            return;
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }

    public static int binaryFind(int[] a, int v) {
        if (a == null) {
            return Integer.MIN_VALUE;
        }
        int p = 0, r = a.length - 1;
        int middle = -1;
        while (p <= r) {
            middle = (p + r) / 2;
            if (a[middle] == v) {
                return middle;
            } else if (a[middle] < v) {
                p = middle + 1;
            } else {
                r = middle - 1;
            }
        }
        return middle;
    }


}
