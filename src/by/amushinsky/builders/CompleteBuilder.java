package by.amushinsky.builders;

public interface CompleteBuilder {
    CompleteBuilder withAge(int age);
    User build();
}
