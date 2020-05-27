package cn.davy.learn.java9;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEnhancement {
    public static void main(String[] args) {
        testIfPresent();
        testOr();
        testStream();
    }

    private static void testIfPresent() {
        // Optional.ifPresent(Consumer<? super T> action)
        // if optional with value, call action, otherwise not
        Optional.ofNullable(null).ifPresent(System.err::println);
        Optional.ofNullable("Hello World").ifPresent(System.err::println);

        // Optional.ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)
        // if optional with value, call action, otherwise call emptyAction
        Optional.ofNullable(null).ifPresentOrElse(System.err::println, () -> System.err.println("is null"));
        Optional.ofNullable("Hello World").ifPresentOrElse(System.err::println, () -> System.err.println("is null"));
    }

    private static void testOr() {
        // Optional.or(Supplier<? extends Optional<? extends T>> supplier)
        // if optional value is null, use supplier generate one value
        Optional.ofNullable(null).or(() -> Optional.of("Default Value")).ifPresent(System.err::println);
        Optional.ofNullable("Hello World").or(() -> Optional.of("Default Value")).ifPresent(System.err::println);
    }

    private static void testStream() {
        // Optional.stream()
        // if optional with value, stream with one value, otherwise stream with zero value
        Optional.ofNullable(null).stream().forEach(System.err::println);
        Optional.ofNullable("Hello World").stream().forEach(System.err::println);
    }
}
