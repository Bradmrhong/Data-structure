package com.brad.datastruct.query;

/**
 * Description:
 *
 * @author Brad <mailto:bradmrhong@gmail.com>
 * @version 1.0
 * @since 2019-12-18 15:07
 */
public class BinarySearch {
    public static int searchEqual(int[] a, int k) {
        if (a == null) {
            return -1;
        }
        int p = 0, r = a.length - 1;
        while (p <= r) {
            int mid = p + ((r - p) >> 2);
            if (a[mid] == k) return a[mid];
            else if (a[mid] < k) p = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

}
