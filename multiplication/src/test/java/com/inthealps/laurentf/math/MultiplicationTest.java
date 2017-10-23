package com.inthealps.laurentf.math;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplicationTest {

    public Multiplication multiplication = new Multiplication();

    @Test
    public void multiplication1ShouldBePerformed() throws Exception {
        // GIVEN
        final double a = 2.0;
        final double b = 2.0;
        // WHEN
        final double result = multiplication.multiply(a, b);
        // THEN
        assertThat(result).isEqualTo(a * b);
    }

    @Test
    public void multiplication2ShouldBePerformed() throws Exception {
        // GIVEN
        final double a = 2.0;
        final double b = 3.0;
        // WHEN
        final double result = multiplication.multiply(a, b);
        // THEN
        assertThat(result).isEqualTo(a * b);
    }

}
