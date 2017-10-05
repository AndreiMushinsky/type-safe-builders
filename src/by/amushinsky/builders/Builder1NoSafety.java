package by.amushinsky.builders;

public class Builder1NoSafety {
    private String firstName;
    private String lastName;
    private Integer age;

    public Builder1NoSafety withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Builder1NoSafety withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Builder1NoSafety withAge(int age) {
        this.age = age;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, age);
    }
}
