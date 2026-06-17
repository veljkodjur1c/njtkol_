/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt3105.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import rs.ac.bg.fon.njt3105.domain.Book;
import rs.ac.bg.fon.njt3105.repository.BookRepository;

/**
 *
 * @author natal
 */
@Repository(value = "jpa-repository")
public class JpaBookRepository implements BookRepository {

    private final EntityManagerFactory emf;

    @Autowired
    public JpaBookRepository(@Qualifier(value = "jakarta.persistence.EntityManagerFactory")EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    @Override
    public Book save(Book b) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        b = em.merge(b);
        em.getTransaction().commit();
        em.close();
        return b;
    }

    @Override
    public void delete(Book b) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        b = em.find(Book.class,b.getId());
        em.remove(b);
        em.getTransaction().commit();
        em.close();
    }
    
}
