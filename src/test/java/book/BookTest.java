package book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getTitle() {
        Book book = new Book("Les fourberies de Scapin", "Molière", "1671");
        Assertions.assertEquals("Les fourberies de Scapin", book.getTitle());
    }

    @Test
    void setTitle() {
        Book book = new Book("Les fourberies de Scapin", "Molière", "1671");
        book.setTitle("Ok");
        Assertions.assertEquals("Ok", book.getTitle());
    }

    @Test
    void getAuthor() {
        Book book = new Book("Les fourberies de Scapin", "Molière", "1671");
        Assertions.assertEquals("Molière", book.getAuthor());
    }

    @Test
    void setAuthor() {
        Book book = new Book("Les fourberies de Scapin", "Molière", "1671");
        book.setAuthor("Ok");
        Assertions.assertEquals("Ok", book.getAuthor());
    }

    @Test
    void getDate() {
        Book book = new Book("Les fourberies de Scapin", "Molière", "1671");
        Assertions.assertEquals("1671", book.getDate());
    }

    @Test
    void setDate() {
        Book book = new Book("Les fourberies de Scapin", "Molière", "1671");
        book.setDate("1500");
        Assertions.assertEquals("1500", book.getDate());
    }
}