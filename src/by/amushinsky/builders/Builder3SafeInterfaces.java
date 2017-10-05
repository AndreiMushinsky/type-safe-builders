package by.amushinsky.builders;


public class Builder3SafeInterfaces implements FirstNameBuilder, LastNameBuilder, CompleteBuilder {

    public static FirstNameBuilder builder() {
        return new Builder3SafeInterfaces();
    }

    private String firstName;
    private String lastName;
    private int age;

    private Builder3SafeInterfaces() {}

    @Override
    public LastNameBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public CompleteBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public CompleteBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public User build() {
        return new User(firstName, lastName, age);
    }
}


