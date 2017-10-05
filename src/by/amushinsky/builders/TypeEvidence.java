package by.amushinsky.builders;

import java.util.function.Function;

public interface TypeEvidence<From, To> extends Function<From, To> {

    static <T> TypeEvidence<T, T> typeEquals() {
        return t -> t;
    }
}
