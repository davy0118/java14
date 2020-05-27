package cn.davy.learn.java9;

import java.awt.Point;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactory {
    public static void main(String[] args) {
        testList();
        testSet();
        testMap();
    }

    private static void testList() {
        List<Point> list = List.of(new Point(1, 1), new Point(2, 2));

        // ERROR: unmodifiable
        // list.add(new Point(3, 3));
    }

    private static void testSet() {
        Set<Point> set = Set.of(new Point(1, 1), new Point(2, 2));

        // ERROR: unmodifiable
        // set.add(new Point(3, 3));

        // ERROR: duplicate not support
        // Set<Point> set2 = Set.of(new Point(1, 1), new Point(2, 2), new Point(2, 2));
    }

    private static void testMap() {
        Map<String, Point> map = Map.of("1x1", new Point(1, 1), "2x2", new Point(2, 2));

        // ERROR: unmodifiable
        // map.put("3x3", new Point(3, 3));

        // ERROR: duplicate key not support
        // Map<String, Point> map2 = Map.of("1x1", new Point(1, 1), "2x2", new Point(2, 2), "2x2", new Point(2, 2));

        // ERROR: null key not support
        // Map<String, Point> map2 = Map.of("1x1", new Point(1, 1), "2x2", new Point(2, 2), null, new Point(0, 0));
    }
}