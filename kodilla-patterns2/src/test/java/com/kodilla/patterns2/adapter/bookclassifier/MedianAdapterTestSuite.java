package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> libraryABooks = new HashSet<>();
        libraryABooks.add(new Book("Terry Pratchett","Night watch",2002,
                "56465464"));
        libraryABooks.add(new Book("Terry Pratchett","Guards! Guards!",1989,
                "1325156456"));
        libraryABooks.add(new Book("Terry Pratchett","Mort",1987,
                "15463514"));
        //When
        int median = medianAdapter.publicationYearMedian(libraryABooks);
        //Then
        assertEquals(1989, median);
    }
}
