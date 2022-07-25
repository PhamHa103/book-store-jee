package com.example.book_store.repository;

import com.example.book_store.entity.Book;
import com.example.book_store.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class BookRepository {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    public List<Book> getAll() {
        return session.createQuery("from Book ", Book.class).list();
    }

    public Book findById(int bookId) {
        try{
            return session.createQuery("from Book where id = "+ bookId, Book.class).getSingleResult();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
