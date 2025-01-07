package huydong.design_pattern_solid.design_pattern.creational_pattern.builder;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void TestBuilder() {
        Pet pet = Dog.builder("muc").weight(30).build();
        Person person = Person.builder("muc")
                .age(30)
                .email("hudyong0210@gmail.com")
                .height(195)
                .pet(pet)
                .build();
        Assert.assertNotNull(person);
    }
}
