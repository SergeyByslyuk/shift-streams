package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FlatmapExample {

    //Задача: хотим получить список уникальных букв из массива слов
    public static void main(String[] args) {

        String[] wordsArray = {"Goodbye", "World"};
        Stream<String> wordsStream = Arrays.stream(wordsArray);

        List<String[]> words = wordsStream
                .map(word -> word.split(""))
//                .map(Arrays::stream)
                .distinct()
                .toList();

    }

    private static void useFlatMap(Stream<String> wordsStream) {
        List<String> words = wordsStream
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .toList();

        System.out.println(words);
    }


}
