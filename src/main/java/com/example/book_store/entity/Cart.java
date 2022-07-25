package com.example.book_store.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CART")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cart implements Serializable {

    @Id
    @Column(nullable = false)
    Long userId;

    @Id
    @Column(nullable = false)
    Long bookId;

    @Column(nullable = false)
    Integer quantity;

    @Column(name = "UNIT_PRICE", nullable = false)
    Integer unitPrice;

}
