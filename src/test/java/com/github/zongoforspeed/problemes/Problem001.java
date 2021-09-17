package com.github.zongoforspeed.problemes;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem001 {
    // Multiples of 3 or 5
    // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
    // multiples is 23.
    //
    // Find the sum of all the multiples of 3 or 5 below 1000.
    @Test
    void solve() {
        long solution = IntStream.range(1, 1000).filter(n -> n % 3 == 0 || n % 5 == 0).asLongStream().sum();
        assertThat(solution).isEqualTo(233168);
    }
}
