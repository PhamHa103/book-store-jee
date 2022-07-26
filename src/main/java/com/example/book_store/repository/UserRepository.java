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

    public User findByUsername(String username) {
        try {
            if (DataUtil.isNullOrEmpty(username)) {
                return null;
            }
            return session.createQuery("from User where username = :p_username", User.class)
                    .setParameter("p_username", username)
                    .getSingleResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public User findByEmail(String email) {
        try {
            if (DataUtil.isNullOrEmpty(email)) {
                return null;
            }
            return session.createQuery("from User where email = :p_email", User.class)
                    .setParameter("p_email", email)
                    .getSingleResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public User findByPhoneNumber(String phoneNumber) {
        try {
            if (DataUtil.isNullOrEmpty(phoneNumber)) {
                return null;
            }
            return session.createQuery("from User where phoneNumber = :p_phoneNumber", User.class)
                    .setParameter("p_phoneNumber", phoneNumber)
                    .getSingleResult();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
