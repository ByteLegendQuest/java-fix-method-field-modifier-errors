package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class HomeTest {
    @Test
    public void testBuildDescription() {
        Cat cat = new Cat("Tom", 2);
        Assertions.assertEquals(
                "I am a cat named Tom and I am 2 years old", cat.buildDescription());
    }

    @Test
    public void buildDescriptionIsNotPublic() {
        Assertions.assertTrue(
                Arrays.stream(Cat.class.getMethods())
                        .noneMatch(method -> method.getName().equals("buildDescription")));
    }
}
