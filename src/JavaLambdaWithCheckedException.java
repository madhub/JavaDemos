import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by bs_ma on 26-07-2015.
 */
public class JavaLambdaWithCheckedException {
    @FunctionalInterface
    public interface ThrowingFunction<T,R> extends Function<T,R> {

        @Override
        default R apply(T t){
            try{
                return applyThrows(t);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }

        R applyThrows(T t) throws Exception;
    }

    public static void main(String[] args) {

        File file = new File("temp");
        File[] files = file.listFiles();



    }

}
