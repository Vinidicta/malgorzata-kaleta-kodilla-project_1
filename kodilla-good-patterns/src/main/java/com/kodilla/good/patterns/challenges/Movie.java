package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private final String id;
    private final List<String> moviesTranslationsList = new ArrayList<>();

    public Movie(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<String> getMoviesTranslationsList() {
        return new ArrayList<>(moviesTranslationsList);
    }

    public void addNewTitle(String title) {
        moviesTranslationsList.add(title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;

        Movie movie = (Movie) o;

        if (!id.equals(movie.id)) return false;
        return moviesTranslationsList.equals(movie.moviesTranslationsList);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + moviesTranslationsList.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "moviesTranslationsList=" + moviesTranslationsList +
                '}';
    }
}
