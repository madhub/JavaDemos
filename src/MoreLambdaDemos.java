import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Objects;
import java.util.stream.DoubleStream;

/**
 * Created by bs_ma on 26-07-2015.
 */
public class MoreLambdaDemos {

    public static void main(String[] args) {

        List<BigDecimal> bigDecimalsValues = new ArrayList<>();
        bigDecimalsValues.add(new BigDecimal(1));
        bigDecimalsValues.add(new BigDecimal(2));
        bigDecimalsValues.add(new BigDecimal(3));
        bigDecimalsValues.add(new BigDecimal(4));
        bigDecimalsValues.add(new BigDecimal(5));
        BigDecimal sumOfBigDecimals = bigDecimalsValues.stream().reduce(
                BigDecimal.ZERO, BigDecimal::add);

        // remove null & sum
        BigDecimal sumOfBigDecimals1 = bigDecimalsValues.stream()
                .filter(Objects::nonNull)
                .reduce(BigDecimal.ZERO, BigDecimal::add);


        DoubleSummaryStatistics doubleSummaryStatistics = DoubleStream
                .generate(Math::random)
                .limit(100)
                .summaryStatistics();


    }
}
