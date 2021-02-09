package com.sda.testowanie.duplicateremover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuplicateRemoverTest {

    @Test
    void testRemoveDuplicates() {

        //given
        String[] strings = {"aa", "bb", "cc", "dd", "dd", "aa", "bb"};
        String[] expected = {"aa", "bb", "cc", "dd"};

        //when
        String[] result = DuplicateRemover.removeDuplicates(strings);

        //then
        assertArrayEquals(expected, result);

    }

    @Test
    void testRemoveDuplicatesWhenNoDuplicates() {

        //given
        String[] strings = {"aa", "bb", "cc", "dd"};
        String[] expected = {"aa", "bb", "cc", "dd"};

        //when
        String[] result = DuplicateRemover.removeDuplicates(strings);

        //then
        assertArrayEquals(expected, result);

    }

    @Test
    void testRemoveDuplicatesWhenEmptyArray() {

        //given
        String[] strings = {};
        String[] expected = {};

        //when
        String[] result = DuplicateRemover.removeDuplicates(strings);

        //then
        assertArrayEquals(expected, result);

    }

    @Test
    void testRemoveDuplicatesWhenEmptyStrings() {

        //given
        String[] strings = {"", "", "aa", "bb", "", "bb", "cc"};
        String[] expected = {"", "aa", "bb", "cc"};

        //when
        String[] result = DuplicateRemover.removeDuplicates(strings);

        //then
        assertArrayEquals(expected, result);

    }

}