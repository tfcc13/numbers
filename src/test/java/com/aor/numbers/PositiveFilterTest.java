package com.aor.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PositiveFilterTest {

    @Test

    public void acceptPositiveNumber() {
        GenericListFilter positiveFilter = new PositiveFilter();
        assertTrue(positiveFilter.accept(3));
    }

    public void acceptNegativeNumber() {
        GenericListFilter positiveFilter = new PositiveFilter();

        assertFalse(positiveFilter.accept(-10));
    }
}
