package huydong.design_pattern_solid.design_pattern.creational_pattern.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonSingleThreadedTest {
    @Test
    public void testSingletonSingleThreaded() {
        SingletonSingleThreaded instance_1 = SingletonSingleThreaded.getInstance("test 1");
        SingletonSingleThreaded instance_2 = SingletonSingleThreaded.getInstance("test 2");
        Assert.assertEquals(instance_1, instance_2);
    }
}
