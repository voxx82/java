package lesson4;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lesson4_streams {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 5, 8, 9);
        Random rnd = new Random();


        integers.stream()
                .filter(e -> e > 4)
                .distinct()
                .map (e -> new User(e))
                .peek(user -> user.setNumbers(
                        Stream.generate(() -> rnd.nextInt(10))
                                .limit(user.getNumber())
                                .collect(Collectors.toList()))
                        )
                .flatMap(user -> user.getNumbers().stream())
                .map(e -> e *10)
                .reduce(Integer::sum)
                .ifPresentOrElse(System.out::println, () -> System.out.println(0));

        List<List<Integer>> lists = List.of(List.of(1, 2), List.of(3, 4, 5));

        lists.stream()
                .sorted((a, b) -> (a.size() - b.size()) * -1)
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        boolean asd = lists.stream()
                .map(e -> e.stream().reduce((a,b) -> a + b).orElse(0))
                .anyMatch(e -> e == 12);

        System.out.println(asd);

    }
}
