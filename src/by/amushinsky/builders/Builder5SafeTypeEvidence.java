package by.amushinsky.builders;


public class Builder5SafeTypeEvidence<WithFirstName, WithLastName> {

    public static Builder5SafeTypeEvidence<TFalse, TFalse> builder() {
        return new Builder5SafeTypeEvidence<>();
    }


    private String firstName;
    private String lastName;
    private Integer age;

    private Builder5SafeTypeEvidence() {}

    private Builder5SafeTypeEvidence(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Builder5SafeTypeEvidence<TTrue, WithLastName> withFirstName(String firstName,
           TypeEvidence<Builder5SafeTypeEvidence<WithFirstName, WithLastName>, Builder5SafeTypeEvidence<TFalse, WithLastName>> evidence) {
        return new Builder5SafeTypeEvidence<>(firstName, lastName, age);
    }

    public Builder5SafeTypeEvidence<WithFirstName, TTrue> withLastName(String lastName,
           TypeEvidence<Builder5SafeTypeEvidence<WithFirstName, WithLastName>, Builder5SafeTypeEvidence<TTrue, TFalse>> evidence) {
        return new Builder5SafeTypeEvidence<>(firstName, lastName, age);
    }

    public Builder5SafeTypeEvidence<WithFirstName, WithLastName> withAge(int age,
           TypeEvidence<Builder5SafeTypeEvidence<WithFirstName, WithLastName>, Builder5SafeTypeEvidence<TTrue, TTrue>> evidence) {
        this.age = age;
        return this;
    }

    public User build(TypeEvidence<Builder5SafeTypeEvidence<WithFirstName, WithLastName>, Builder5SafeTypeEvidence<TTrue, TTrue>> evidenced) {
        return new User(firstName, lastName);
    }


    interface TBool {}
    interface TTrue extends TBool {}
    interface TFalse extends TBool {}
}
