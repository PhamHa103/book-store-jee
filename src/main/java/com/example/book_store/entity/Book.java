package com.example.book_store.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BOOK")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_sequence")
    @SequenceGenerator(name = "book_sequence", sequenceName = "book_sequence", allocationSize = 1, initialValue = 1)
    @Column(nullable = false)
    Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String author;

    @Column(nullable = false)
    String publisher;

    @Column(name = "PUBLISHED_YEAR", nullable = false)
    Integer publishedYear;

    @Column
    String description;

    @Column(name = "UNIT_PRICE", nullable = false)
    Integer unitPrice;

    @Column(name = "PAGE_TOTAL", nullable = false)
    Integer pageTotal;

    @Column(name= "BOOK_SIZE", nullable = false)
    String bookSize;
}
