package com.kodilla.good.patterns.challenges;

import java.util.*;


public class MovieStore {

    private final Map<String, List<String>> moviesTitlesWithTranslations = new HashMap();


    public void addNewMovie(Movie... movies) {
        for (Movie movie : movies) {
            this.moviesTitlesWithTranslations.put(movie.getId(), movie.getMoviesTranslationsList());
        }
    }

    public Map<String, List<String>> getMoviesTitlesWithTranslations() {
        return new HashMap<>(moviesTitlesWithTranslations);
    }

    public void getMovie(String signature) {
        if (moviesTitlesWithTranslations.containsKey(signature)) {
            getMoviesTitlesWithTranslations()
                    .get(signature).stream()
                    .map(m -> m.concat("!"))
                    .forEach(System.out::print);

        } else {
            System.out.println("Movie with this signature wasn't found");
        }
    }

    @Override
    public String toString() {
        return "MovieStore{" +
                "moviesTitlesWithTranslations=" + moviesTitlesWithTranslations +
                '}';
    }
}
