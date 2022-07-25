package com.example.book_store.repository;

import com.example.book_store.entity.User;
import com.example.book_store.util.DataUtil;
import com.example.book_store.util.HibernateUtil;
import org.hibernate.Session;

public class UserRepository {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    public User login(String username, String password) {
        try {
            if (DataUtil.isNullOrEmpty(username) || DataUtil.isNullOrEmpty(password)) {
                return null;
            }
            return session.createQuery("from User where username = :p_username and password = :p_password", User.class)
                    .setParameter("p_username", username)
                    .setParameter("p_password", password)
                    .getSingleResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
