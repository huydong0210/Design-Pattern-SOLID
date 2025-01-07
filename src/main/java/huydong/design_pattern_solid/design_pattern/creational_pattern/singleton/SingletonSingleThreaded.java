package huydong.design_pattern_solid.design_pattern.creational_pattern.singleton;

import java.util.Objects;

public class SingletonSingleThreaded {
    private static SingletonSingleThreaded instance;
    public String value;
    private SingletonSingleThreaded (String value){
        this.value = value;
    }
    public static SingletonSingleThreaded getInstance(String value){
        if (Objects.isNull(instance)){
            instance = new SingletonSingleThreaded(value);
        }
        return instance;
    }
}
