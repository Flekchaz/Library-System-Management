package com.example.library_management_system.services;

import com.example.library_management_system.Entities.Author;
import com.example.library_management_system.Entities.Book;
import com.example.library_management_system.Entities.Patron;
import com.example.library_management_system.repositories.AuthorRepo;
import com.example.library_management_system.repositories.BookRepo;
import com.example.library_management_system.repositories.PatronRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor @Data

@Transactional
//@Transactional

public class LibraryService {
    private final AuthorRepo authorRepo;

    private final BookRepo bookRepo;
    private final PatronRepo patronRepo;

    public void initializeData(){
        Author author = new Author();
        author.setName("John");
        author.setBiography("One of the best author outhere");
        authorRepo.save(author);

        Book book = new Book();
        book.setTitle("Lord of the rings");
        book.setISBN("OS523Y");
        book.setPublication_date(new Date());
        bookRepo.save(book);

        Patron patron = new Patron();
        patron.setName("Charles");
        patron.setEmail("charles.so@example.com");
        patronRepo.save(patron);

        book.setBorrowed(true);
        book.setPatron(patron);
        bookRepo.save(book);
    }


    public List<Author> getAllAuthors(){
        return authorRepo.findAll();
    }

    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }

    public List<Patron> getAllPatron(){
        return patronRepo.findAll();
    }

    public void addAuthor(Author author) {
        authorRepo.save(author);
    }

    public void addBook(Book book) {
    bookRepo.save(book);
    }

    public void addPatron(Patron patron) {
        patronRepo.save(patron);
    }

    public void borrowBook(Long bookId, Long patronId) {

        Book book = bookRepo.findById(bookId).orElseThrow(()-> new RuntimeException("Book not found"));
        Patron patron = patronRepo.findById(patronId).orElseThrow(()-> new RuntimeException("Patron not found"));

        book.setBorrowed(true);
        book.setPatron(patron);

        bookRepo.save(book);






    }
}
