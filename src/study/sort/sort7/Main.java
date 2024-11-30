package study.sort.sort7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Coordinate> list = new ArrayList<>(Arrays.asList(
                new Coordinate(2, 7),
                new Coordinate(1, 3),
                new Coordinate(1, 2),
                new Coordinate(2, 5),
                new Coordinate(3, 6)
        ));
        list.stream().sorted().forEach(System.out::println);
        System.out.println("==========================");
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}

class Coordinate implements Comparable<Coordinate> {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%d %d", x, y);
    }

    @Override
    public int compareTo(Coordinate o) {
        int result = Integer.compare(x, o.x);
        if (result == 0) {
            result = Integer.compare(y, o.y);
        }
        return result;
    }
}


