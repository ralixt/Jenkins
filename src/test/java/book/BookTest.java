package book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @MethodSource
    void getTitle() {
        Book book = new Book("Les fourberies de Scapin", "Molière", "1671");
        Assertions.assertEquals("Les fourberies de Scapin", book.getTitle());
    }

    @MethodSource
    void setTitle() {
        Book book = new Book("Les fourberies de Scapin", "Molière", "1671");
        book.setTitle("Ok");
        Assertions.assertEquals("Ok", book.getTitle());
    }

    @MethodSource
    void getAuthor() {
        Book book = new Book("Les fourberies de Scapin", "Molière", "1671");
        Assertions.assertEquals("Molière", book.getAuthor());
    }

    @MethodSource
    void setAuthor() {
        Book book = new Book("Les fourberies de Scapin", "Molière", "1671");
        book.setAuthor("Ok");
        Assertions.assertEquals("Ok", book.getAuthor());
    }

    @MethodSource
    void getDate() {
        Book book = new Book("Les fourberies de Scapin", "Molière", "1671");
        Assertions.assertEquals("1671", book.getDate());
    }

    @MethodSource
    void setDate() {
        Book book = new Book("Les fourberies de Scapin", "Molière", "1671");
        book.setDate("1500");
        Assertions.assertEquals("1500", book.getDate());
    }
    
}