package com.kodilla.patterns2.adapter.bookclassifier;


import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> bookMap =
                new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclassifier.librarya.Book book : bookSet) {
            com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book bookB =
                    new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(book.getAuthor(),
                            book.getTitle(), book.getPublicationYear());

            bookMap.put(new BookSignature(book.getSignature()), bookB);
        }
        return medianPublicationYear(bookMap);
    }
}
