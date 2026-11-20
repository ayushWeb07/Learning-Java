package section26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMapDemo {
    public static void main(String[] args) {
        // breaking down the steps
        ArrayList<String> list= new ArrayList<>();
        list.add("virat");
        list.add("ronaldo");
        list.add("jordan");
        list.add("lewis");
        list.add("rogan");

         // Stream<String> stream= list.stream(); // 1: get the input stream from the array
         // Stream<String[]> intermediateStream= stream.map((String st) -> st.split("")); // 2: apply the map intermediate operation
         // Stream<String> flattenedStream= intermediateStream.flatMap((String[] s) -> Arrays.stream(s)); // 3: apply the flatmap intermediate operation
         // flattenedStream.forEach(System.out::println); // 4: apply the terminal operation

        // wiring them together as a pipeline
        list.stream()
                .map((String st) -> st.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

    }
}
