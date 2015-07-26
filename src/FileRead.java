import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by bs_ma on 26-07-2015.
 */
public class FileRead {

    public static void main(String[] args) throws IOException {
        // read all lines, trim & remove empty lines.
        Files.lines(new File("manifest.mf").toPath())
                .map(s -> s.trim())
                .filter(s -> !s.isEmpty()).forEach(System.out::println);


        // read all lines, trim & print only lines which starts with

        Files.lines(Paths.get("build.xml"))
                .map(s -> s.trim())
                .filter(s -> s.startsWith(""))
                .forEach(System.out::println);
    }

    public void watchFileChange(String directoryPath) throws IOException, InterruptedException {

        final Path path = Paths.get(directoryPath);
        final WatchService watchService =
                path.getFileSystem().newWatchService();
        path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
        System.out.println("Report any file changed within next 1 minute ...");

        final WatchKey watchKey = watchService.poll(1, TimeUnit.MINUTES);
        if (watchKey != null) {
            watchKey.pollEvents()
                    .stream()
                    .forEach(event -> System.out.println(event.context()));
        }
    }

}
