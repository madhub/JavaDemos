import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by bs_ma on 26-07-2015.
 */
public class JGrep {

    public static Stream<String> grep (String pattern, String fileName) throws IOException {
        return Files.lines(Paths.get(fileName))
                .filter(line -> line.matches(pattern));
    }

    /**
     * java JGrep ".*public.*" Grep.java
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        grep(args[0], args[1]).forEach(System.out::println);
    }
}
