package com.kodilla.good.patterns.challenges;

public class MovieMain {

    public static void main(String[] args) {

        final Movie movie1 = new Movie("IM");
        movie1.addNewTitle("Iron Man");
        movie1.addNewTitle("Zelazny czlowiek");

        final Movie movie2 = new Movie("FL");
        movie2.addNewTitle("Flash");
        movie2.addNewTitle("Blyskawica");

        final Movie movie3 = new Movie("AV");
        movie3.addNewTitle("Avengers");
        movie3.addNewTitle("Msciciele");

        final MovieStore movieStore = new MovieStore();
        movieStore.addNewMovie(movie1, movie2, movie3);
        movieStore.getMovie("FL");
    }
}


