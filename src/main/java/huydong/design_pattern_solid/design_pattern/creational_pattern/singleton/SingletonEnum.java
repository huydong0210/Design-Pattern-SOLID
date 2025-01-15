package huydong.design_pattern_solid.design_pattern.creational_pattern.singleton;

public enum SingletonEnum {
    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
