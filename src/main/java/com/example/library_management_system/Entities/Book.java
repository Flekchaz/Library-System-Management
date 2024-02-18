package com.example.library_management_system.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor

public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String ISBN;
    private Date publication_date;
    @ManyToOne
    private Author author;
    @ManyToOne
    private Patron patron;

    private boolean borrowed;



}
