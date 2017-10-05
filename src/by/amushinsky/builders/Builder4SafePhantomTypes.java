package by.amushinsky.builders;

public class Builder4SafePhantomTypes<WithFirstName, WithLastName, WithAge> {

    public static Builder4SafePhantomTypes<TFalse, TFalse, TFalse> builder() {
        return new Builder4SafePhantomTypes<>();
    }


    public static User build(Builder4SafePhantomTypes<TTrue, TTrue, TTrue> builder) {
        return new User(builder.firstName, builder.lastName, builder.age);
    }


    private String firstName;
    private String lastName;
    private Integer age;

    private Builder4SafePhantomTypes() {}

    private Builder4SafePhantomTypes(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Builder4SafePhantomTypes<TTrue, WithLastName, WithAge> withFirstName(String firstName) {
        return new Builder4SafePhantomTypes<>(firstName, lastName, age);
    }

    public Builder4SafePhantomTypes<WithFirstName, TTrue, WithAge> withLastName(String lastName) {
        return new Builder4SafePhantomTypes<>(firstName, lastName, age);
    }

    public Builder4SafePhantomTypes<WithFirstName, WithLastName, TTrue> withAge(int age) {
        return new Builder4SafePhantomTypes<>(firstName, lastName, age);
    }

    interface TBool {}
    interface TTrue extends TBool {}
    interface TFalse extends TBool {}

}
