package com.inthealps.laurentf.math;

import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdditionTest {

    public Addition multiplication = new Addition();

    @Test
    public void addition1ShouldBePerformed() throws Exception {
        // GIVEN
        final double a = 2.0;
        final double b = 2.0;
        // WHEN
        final double result = multiplication.add(a, b);
        // THEN
        assertThat(result).isEqualTo(a + b);
    }

    // FIXME Remove 'ignore' annotation
    @Ignore
    @Test
    public void addition2ShouldBePerformed() throws Exception {
        // GIVEN
        final double a = 2.0;
        final double b = 3.0;
        // WHEN
        final double result = multiplication.add(a, b);
        // THEN
        assertThat(result).isEqualTo(a + b);
    }
}
