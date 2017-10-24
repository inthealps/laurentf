package com.inthealps.laurentf.math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
public class FactorialTest {
    @Inject
    Factorial factorial;

    @Test
    public void factorial0ShouldBeComputed() throws Exception {
        // GIVEN
        // ... nothing particular ...
        // WHEN
        final int result = factorial.fact(0);
        // THEN
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void factorial5ShouldBeComputed() throws Exception {
        // GIVEN
        // ... nothing particular ...
        // WHEN
        final int result = factorial.fact(5);
        // THEN
        assertThat(result).isEqualTo(120);
    }

    @Test
    public void factorial10ShouldBeComputed() throws Exception {
        // GIVEN
        // ... nothing particular ...
        // WHEN
        final int result = factorial.fact(10);
        // THEN
        assertThat(result).isEqualTo(3628800);
    }

    /**
     * Test scenario, a number greater that the one configured below (factorialLimit=50) should raise IllegalArgumentException.
     *
     * @throws IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void factorial100ShouldRaiseException() throws Exception {
        // GIVEN
        // ... nothing particular ...
        // WHEN
        final int result = factorial.fact(100);
        // THEN
        // ... nothing, exception should be raised
    }

    @Configuration
    public static class FactorialTestConfig {
        public int factorialLimit = 50;

        @Bean
        public Factorial factorial() {
            final Factorial factorial = new Factorial();
            factorial.setLimit(factorialLimit);
            return factorial;
        }
    }
}
