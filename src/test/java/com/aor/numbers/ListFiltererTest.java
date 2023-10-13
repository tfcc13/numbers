package com.aor.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListFiltererTest {

    private List<Integer> list, expected;
    @BeforeEach

    public void makeList() {
        list = Arrays.asList(-4, -3, -1, 0, 2, 5);
        
    }
    @Test
    public void  positiveFilterTest() {
       GenericListFilter positiveFilter = new PositiveFilter();
       ListFilterer listFilterer = new ListFilterer(positiveFilter);
       List<Integer> filteredList = listFilterer.filter(list);

       expected = Arrays.asList(2,5);

       assertEquals(expected, filteredList);
       
    }

    @Test

    public void divisibleFilterTest() {
        GenericListFilter divisibleFilter  = new DivisibleFilter();
        ListFilterer listFilterer = new ListFilterer(divisibleFilter);
        List<Integer> filteredList = listFilterer.filter(list);

        expected = Arrays.asList(-4,2);

        assertEquals(expected, filteredList);
    }

}
