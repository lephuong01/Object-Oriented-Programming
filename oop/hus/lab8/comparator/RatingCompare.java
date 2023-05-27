package oop.hus.lab8.comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        if (left.getRating() - right.getRating() > 0) {
            return  1;
        } else if (left.getRating() - right.getRating() == 0) {
            return 0;
        }
        return -1;
    }
}
