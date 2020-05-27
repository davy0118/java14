package cn.davy.learn.java9;

import java.util.List;
import java.util.stream.Stream;

public class StreamEnhancement {
    public static void main(String[] args) {
        testWhile();
        testNull();
        testIterate();
    }

    private static void testWhile() {
        // take data until predict failed
        // take care the order
        List.of(-2, 0, 1, -1, 2, 3).stream().takeWhile(t -> t <= 0).forEach(System.err::println);

        // remove data until predict failed
        // take care the order
        List.of(-2, 0, 1, -1, 2, 3).stream().dropWhile(t -> t <= 0).forEach(System.err::println);
    }

    private static void testNull() {
        Stream.ofNullable(null).forEach(System.err::println);
        Stream.ofNullable("Hello World").forEach(System.err::println);
    }

    private static void testIterate() {
        Stream.iterate(10, i -> i < 15, i -> i + 1).forEach(System.err::println);
    }
}
