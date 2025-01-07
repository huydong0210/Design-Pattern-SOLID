package huydong.design_pattern_solid.design_pattern.creational_pattern.builder;

class Dog implements Pet {
    //required parameters
    private String name;
    //optional parameter

    private float weight;

    private Dog(DogBuilder builder) {
        this.name = builder.name;
        this.weight = builder.weight;
    }

    static class DogBuilder {
        private String name;
        private float weight;

        protected DogBuilder(String name) {
            this.name = name;
        }
        protected DogBuilder weight(float weight) {
            this.weight = weight;
            return this;
        }
        protected Dog build() {
            return new Dog(this);
        }

    }

}
