package com.aor.numbers;

public class DivisibleFilter implements GenericListFilter {


    @Override

    public boolean accept(Integer number) {
        return accept(number,2);
    }

    public boolean accept(Integer number, int divisor) {
        return number % divisor == 0 && number != 0;
    }
}
