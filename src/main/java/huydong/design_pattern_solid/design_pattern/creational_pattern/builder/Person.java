package huydong.design_pattern_solid.design_pattern.creational_pattern.builder;

class Person {

    //required
    private String name;
    //optional
    private String email;
    //optional
    private int age;
    //optional
    private float height;
    //optional
    private Pet pet;
    protected static Builder builder(String name){
        return new Builder(name);
    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.height = builder.height;
        this.pet = builder.pet;
    }

    static class Builder {
        private String name;
        private String email;
        private int age;
        private float height;
        private Pet pet;


        private Builder(Builder builder) {
            this.name = builder.name;
            this.email = builder.email;
            this.age = builder.age;
            this.height = builder.height;
            this.pet = builder.pet;

        }

        private Builder(String name) {
            this.name = name;
        }

        protected Builder email(String email) {
            this.email = email;
            return this;
        }

        protected Builder age(int age) {
            this.age = age;
            return this;
        }

        protected Builder height(float height) {
            this.height = height;
            return this;
        }

        protected Builder pet(Pet pet) {
            this.pet = pet;
            return this;
        }

        protected Person build(){
            return new Person(this);
        }

    }

}
