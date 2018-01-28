package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        Library library = new Library("Some books library");
        library.getBooks().add(new Book("Book1", "Author1", LocalDate.of(1954, 12, 01)));
        library.getBooks().add(new Book("Book2", "Author2", LocalDate.of(2005, 03, 02)));
        library.getBooks().add(new Book("Book3", "Author3", LocalDate.of(1990, 06, 14)));
        library.getBooks().add(new Book("Book4", "Author4", LocalDate.of(2000, 11, 30)));

        System.out.println(library);

        int librarySize = library.getBooks().size();

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("New Library 1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(clonedLibrary);

        int clonedLibrarySize = clonedLibrary.getBooks().size();

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("New Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(deepClonedLibrary);

        int deepClonedLibarySize = deepClonedLibrary.getBooks().size();

        assertEquals(4, librarySize);
        assertEquals(4, clonedLibrarySize);
        assertEquals(4, deepClonedLibarySize);
    }
}
