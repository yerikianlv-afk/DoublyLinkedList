import java.util.Objects;

public class Movie {
    private final String title;
    private final String director;
    private final int year;

    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " (" + year + ") dirigida por " + director;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year
                && Objects.equals(title, movie.title)
                && Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, director, year);
    }
}