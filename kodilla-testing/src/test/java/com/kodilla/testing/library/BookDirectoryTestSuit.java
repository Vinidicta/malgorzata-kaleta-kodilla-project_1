package com.kodilla.testing.library;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BookDirectoryTestSuit {

    public static int testCounter = 0;

    @Before
    public void before(){
        testCounter++;
        System.out.println("Test suit number " + testCounter +": begin" );
    }

    @After
    public void after(){
        System.out.println("Test suit: end");
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    //This is test method for case when user has been borrowed no books
    @Test
    public void testListBooksInHandsOfNoBooksBorrowed(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser adamNowak = new LibraryUser("Adam", "Nowak", "90010154118");
        List<Book> usersBooksList = new ArrayList<>();

        when(libraryDatabaseMock.listBooksInHandsOf(adamNowak)).thenReturn(usersBooksList);
        //When
        List<Book> result = libraryDatabaseMock.listBooksInHandsOf(adamNowak);
        //Then
        assertTrue(result.size()==0);
        assertTrue(result.isEmpty());
    }

    //This is test method for case when user has been borrowed one book
    @Test
    public void testListBooksInHandsOfOneBookBorrowed(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser adamNowak = new LibraryUser("Adam", "Nowak", "90010154118");
        List<Book> usersBooksList = generateListOfNBooks(1);

        when(libraryDatabaseMock.listBooksInHandsOf(adamNowak)).thenReturn(usersBooksList);
        //When
        List<Book> result = libraryDatabaseMock.listBooksInHandsOf(adamNowak);
        //Then
        assertTrue(result.size()==1);
    }

    //This is test method for case when user has been borrowed five books
    @Test
    public void testListBooksInHandsOfFiveBooksBorrowed(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser adamNowak = new LibraryUser("Adam", "Nowak", "90010154118");
        List<Book> usersBooksList = generateListOfNBooks(5);

        when(libraryDatabaseMock.listBooksInHandsOf(adamNowak)).thenReturn(usersBooksList);
        //When
        List<Book> result = libraryDatabaseMock.listBooksInHandsOf(adamNowak);
        //Then
        assertTrue(result.size()==5);
    }
}
