import java.math.BigDecimal;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.*;

/**
 * Created by bs_ma on 26-07-2015.
 */
public class Java8ComparatorExample {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(new Movie("1", "Inside Out", Date.from(Instant.now()), BigDecimal.valueOf(10.10), "Nice"),
                new Movie("2", "Minions", Date.from(Instant.now().plus(1, ChronoUnit.DAYS)), BigDecimal.valueOf(10.10), "Ok"));

        //movies.sort(Comparator.comparing(Movie.));
    }

    /**
     * Data-centric class encapsulating all fields related to movies (a 'model object').
     * <p>
     * <P>This class exists  in order to encapsulate, validate, and sort movie information.
     * This class is used both to validate user input, and act as a 'transfer object' when
     * interacting with the database.
     */
    static class Movie implements Comparable<Movie> {

        // PRIVATE
        private String fId;
        private final String fTitle;
        private final Date fDateViewed;
        private final BigDecimal fRating;
        private final String fComment;
        private static final BigDecimal TEN = new BigDecimal("10.0");
        private static final int EQUAL = 0;
        private static final int DESCENDING = -1;

        /**
         * Constructor taking regular Java objects natural to the domain.
         *
         * @param aId         optional, the database identifier for the movie. This
         *                    item is optional since, for 'add' operations, it has yet to be
         *                    assigned by the database.
         * @param aTitle      has content, name of the movie
         * @param aDateViewed optional, date the movie was screened by the user
         * @param aRating     optional, in range 0.0 to 10.0
         * @param aComment    optional, any comment on the movie
         */
       public Movie(String aId, String aTitle, Date aDateViewed, BigDecimal aRating, String aComment
        ) {
            fId = aId;
            fTitle = aTitle;
            fDateViewed = aDateViewed;
            fRating = aRating;
            fComment = aComment;

        }


        public String getId() {
            return fId;
        }

        public String getTitle() {
            return fTitle;
        }

        public Date getDateViewed() {
            return fDateViewed;
        }

        public BigDecimal getRating() {
            return fRating;
        }

        public String getComment() {
            return fComment;
        }


        @Override
        public int compareTo(Movie o) {
            return 0;
        }
    }
}
