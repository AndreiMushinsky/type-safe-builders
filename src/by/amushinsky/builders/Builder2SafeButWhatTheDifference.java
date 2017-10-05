package by.amushinsky.builders;

public class Builder2SafeButWhatTheDifference {
    private final String firstName;
    private final String lastName;
    private Integer age;

    public Builder2SafeButWhatTheDifference(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Builder2SafeButWhatTheDifference withAge(int age) {
        this.age = age;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, age);
    }
}
