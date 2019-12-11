package com.brad.datastruct.String;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description:
 *
 * @author Brad <mailto:brad.hong@bindo.com>
 * @version 1.0
 * @since 2019-12-10 16:07
 */
public class StringUitlsTest {

    @Test
    public void lengthOfLongestSubstring() {
        assertEquals(3, StringUitls.lengthOfLongestSubstring("abcabcbb"));
    }
}