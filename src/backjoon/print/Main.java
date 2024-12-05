package backjoon.print;


import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<String, String> favouriteMovies
                = Map.ofEntries(
                Map.entry("Raphael", "Star Wars"),
                Map.entry("Cristina", "Matrix"),
                Map.entry("Olivia", "James Bond"),
                Map.entry("Alice", "ALICE")
        );

        favouriteMovies
                .entrySet()
                .stream()
                .sorted(Entry.comparingByKey())
                .forEachOrdered(System.out::println);
    }
}