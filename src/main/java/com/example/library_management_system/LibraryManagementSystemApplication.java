package com.example.library_management_system;

import com.example.library_management_system.Entities.Author;
import com.example.library_management_system.Entities.Book;
import com.example.library_management_system.Entities.Patron;
import com.example.library_management_system.services.LibraryService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ConditionContext;

import java.util.Date;

@SpringBootApplication


public class LibraryManagementSystemApplication{

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementSystemApplication.class, args);

    }

    @Autowired
    LibraryService libraryService;





    public void onApplication(){
        libraryService.initializeData();
    }



    /*
    @Bean
     public CommandLineRunner demo(LibraryService libraryService){


        return args -> {
            Author author = new Author();
            author.setName("John");
            author.setBiography("One of the best author outhere");
            libraryService.addAuthor(author);

            Book book = new Book();
            book.setTitle("Lord of the rings");
            book.setISBN("B5323S");
            book.setPublication_date(new Date());
            book.setAuthor(new Author());
            libraryService.addBook(book);

            Patron patron = new Patron();
            patron.setName("Hamid rbandaz");
            patron.setEmail("hamid.rbandaz@example.com");
            libraryService.addPatron(patron);

            libraryService.borrowBook(patron.getId(),book.getId());


        };

    }*/



}
