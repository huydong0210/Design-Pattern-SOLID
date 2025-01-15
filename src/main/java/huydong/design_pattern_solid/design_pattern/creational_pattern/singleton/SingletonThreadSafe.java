package huydong.design_pattern_solid.design_pattern.creational_pattern.singleton;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe instance;

    public String value;

    private SingletonThreadSafe(String value) {
        this.value = value;
    }

    public static SingletonThreadSafe getInstance(String value) {
        SingletonThreadSafe result = instance;
        if (result != null) {
            return result;
        }
        synchronized (SingletonThreadSafe.class) {
            if (instance == null) {
                instance = new SingletonThreadSafe(value);
            }
            return instance;
        }
    }
}
