package com.example.book_store.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartPrimaryKey implements Serializable {

    Long userId;

    Long bookId;

}
