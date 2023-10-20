package com.aor.numbers;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DivisibleFilterTest {

    public void acceptDivisibleNumber() {
        GenericListFilter divisibleFilter = new DivisibleFilter();
        assertTrue(divisibleFilter.accept(4));
    }

    public void acceptNonDivisibleNumber() {
        GenericListFilter divisibleFilter = new DivisibleFilter();
        assertFalse(divisibleFilter.accept(5));
        }
}
