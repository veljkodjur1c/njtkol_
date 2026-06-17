/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt3105.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import rs.ac.bg.fon.njt3105.domain.Book;
import rs.ac.bg.fon.njt3105.repository.BookRepository;

/**
 *
 * @author natal
 */
@Repository(value = "hibernate-repository")
public class HibernateBookRepository implements BookRepository {

    private final SessionFactory sf;

    @Autowired
    public HibernateBookRepository(@Qualifier(value = "org.hibernate.SessionFactory")SessionFactory sf) {
        this.sf = sf;
    }
    
    @Override
    public Book save(Book b) {
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        b = s.merge(b);
        t.commit();
        s.close();
        return b;
    }

    @Override
    public void delete(Book b) {
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        b = s.find(Book.class,b.getId());
        s.remove(b);
        t.commit();
        s.close();
    }
    
}
