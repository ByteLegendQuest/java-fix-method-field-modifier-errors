package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class HomeTest {
    @Test
    public void testDescribeMyself() {
        Cat cat = new Cat("Tom", 2);
        Assertions.assertEquals("I am a cat named Tom and I am 2 years old", cat.describeMyself());
    }

    @Test
    public void testVerifyAge() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Cat("Tom", -1));
    }

    @Test
    public void verifyAgeIsNotPublic() {
        Assertions.assertTrue(
                Arrays.stream(Cat.class.getMethods())
                        .noneMatch(method -> method.getName().equals("verifyAge")));
    }
}
