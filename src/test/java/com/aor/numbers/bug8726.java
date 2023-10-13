package com.aor.numbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;


public class bug8726 {
    @Test
    public void fakeBug () {

        class FakeClass implements  GenericListDeduplicator {
            public List<Integer> deduplicate(List<Integer> list) {
                return Arrays.asList(1,2,4);
            }
            
        }

        GenericListDeduplicator deduplicator = new FakeClass();
        List<Integer> list = Arrays.asList(1,2,4,2);
        ListAggregator aggregator = new ListAggregator();
        int distinct = aggregator.distinct(list, deduplicator);

        Assertions.assertEquals(3, distinct);
    }

    }


