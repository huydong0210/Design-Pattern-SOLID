package huydong.design_pattern_solid.design_pattern.creational_pattern.builder;

class Dog implements Pet {
    //required parameters
    private String name;
    //optional parameter

    private float weight;

    private Dog(Builder builder) {
        this.name = builder.name;
        this.weight = builder.weight;

    }

    static Builder builder(String name) {
        return new Builder(name);
    }

    static class Builder {
        private String name;
        private float weight;


        private Builder(String name) {
            this.name = name;
        }

        protected Builder weight(float weight) {
            this.weight = weight;
            return this;
        }

        protected Dog build() {
            return new Dog(this);
        }

    }

}
