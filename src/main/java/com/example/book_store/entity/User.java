package com.example.book_store.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USERS")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1, initialValue = 1)
    @Column(nullable = false)
    Long id;

    @Column(nullable = false)
    String username;

    @Column(nullable = false)
    String password;

    @Column(name = "FULL_NAME", nullable = false)
    String fullName;

    @Column(nullable = false )
    String email;

    @Column(nullable = false)
    String address;

    @Column(name = "PHONE_NUMBER", nullable = false)
    String phoneNumber;

}
