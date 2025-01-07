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

    static class PersonBuilder {
        private String name;
        private String email;
        private int age;
        private float height;
        private Pet pet;

        private PersonBuilder(PersonBuilder builder) {
            this.name = builder.name;
            this.email = builder.email;
            this.age = builder.age;
            this.height = builder.height;
            this.pet = builder.pet;

        }


        protected PersonBuilder(String name) {
            this.name = name;
        }

        protected PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        protected PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        protected PersonBuilder height(float height) {
            this.height = height;
            return this;
        }

        protected PersonBuilder pet(Pet pet) {
            this.pet = pet;
            return this;
        }

    }

}
