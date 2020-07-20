package main.java.com.shabatin.builder;

public class User {

    private String firstName;
    private String lastName;
    private String city;
    private int age;

    private User() {
    }

    public static Builder builder() {
        return new User().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Builder setFirstName(String firstName) {
            User.this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            User.this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            User.this.age = age;
            return this;
        }

        public Builder setCity(String city) {
            User.this.city = city;
            return this;
        }

        public User build() {
            return User.this;
        }
    }

    @Override
    public String toString() {
        return "User " + '\n' +
                "FirstName: " + firstName + '\n' +
                "LastName: " + lastName + '\n' +
                "City: " + city + '\n' +
                "Age: " + age + '\n';
    }
}
