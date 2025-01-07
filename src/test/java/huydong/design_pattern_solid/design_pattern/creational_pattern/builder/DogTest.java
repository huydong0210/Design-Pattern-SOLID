package huydong.design_pattern_solid.design_pattern.creational_pattern.builder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testDogBuilder() {
        Dog dog = Dog.builder("muc")
                .weight(30)
                .build();
        Assert.assertNotNull(dog);
    }
}
