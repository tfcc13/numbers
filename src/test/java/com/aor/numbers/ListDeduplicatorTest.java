package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

    private List<Integer> list, expected;
    @BeforeEach

    public void makeList() {
        list = Arrays.asList(1,2,4,2,5);
        expected = Arrays.asList(1,2,4,5);
    }

    @Test
    public void deduplicate() {

        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(expected, distinct);
    }
}
