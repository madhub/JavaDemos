import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by bs_ma on 26-07-2015.
 */
public class CountWords {

    public static void main(String[] args) throws IOException {

        // Count all distinct words in file
        Files.lines(Paths.get(""))
                .filter(String::isEmpty)
                .flatMap( line-> Arrays.stream(line.split(" ")))
                .distinct()
                .collect(Collectors.toList());


         Files.lines(Paths.get("C:\\temp\\reset.bat"))
//                .filter(String::isEmpty) // can do not on method reference
                .flatMap(line -> Arrays.stream(line.split(" ")))
                 //.peek(System.out::println)
                 .collect(Collectors.groupingBy(word -> word,
                         Collectors.counting())).forEach((k, v) -> {
             System.out.println(k + "=" + v);
         });
//                .collect(Collectors.groupingBy(word -> word,
//                        Collectors.reducing(0, a1 -> {
//                            return 1;
//                        }, Integer::sum))).forEach( (k,v) -> {
//                    System.out.println(k+"="+v);
//                });


    }
}
