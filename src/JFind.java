import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Madhusudana  on 26-07-2015.
 */
public class JFind {

    /**
     * recursively traverse all subdirectories of the starting directory passed by the user.
     * Then, filter the files based on the user suppled pattern
     * @param dir
     * @param pattern
     * @return
     * @throws IOException
     */
    public static Stream<Path> find(String dir, String pattern) throws IOException {
        return Files.walk(Paths.get(dir))//.peek(System.out::println)
                .filter(path -> path.getFileName()
                        .toString()
                        .matches(pattern));
    }

    /**
     * java JFind c:\\temp ".*\.java"

     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        find(args[0], args[1]).forEach(System.out::println);
    }

}
