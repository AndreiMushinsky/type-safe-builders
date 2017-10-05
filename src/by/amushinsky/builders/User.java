package by.amushinsky.builders;

import java.util.Optional;

public class User {

    private final String firstName;

    private final String lastName;

    private final Integer age;

    User(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }
}
