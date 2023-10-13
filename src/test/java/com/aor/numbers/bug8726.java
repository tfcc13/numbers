package com.aor.numbers;
import java.util.List;
import java.util.Arrays;


public class bug8726 {

    public int fakeBug () {
        List<Integer> list = Arrays.asList(1,2,3,2);
        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> distinct = deduplicator.deduplicate(list);

        return distinct.size();
    }

    }


