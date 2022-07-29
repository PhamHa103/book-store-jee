package com.example.book_store.repository;

import com.example.book_store.entity.Cart;
import com.example.book_store.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class CartRepository {
    public List<Cart> getAll() {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            return session.createQuery("from Cart",Cart.class).list();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Cart getByUser(Long id) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            return session.createQuery("from Cart where userId = :p_user_id",Cart.class)
                    .setParameter("p_user_id",id)
                    .getSingleResult();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
