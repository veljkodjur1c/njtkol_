package rs.ac.bg.fon.njt3105.config;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import rs.ac.bg.fon.njt3105.converter.Converter;
import rs.ac.bg.fon.njt3105.domain.Book;
import rs.ac.bg.fon.njt3105.dto.BookDto;
import rs.ac.bg.fon.njt3105.repository.BookRepository;
import rs.ac.bg.fon.njt3105.service.BookService;
import rs.ac.bg.fon.njt3105.service.impl.BookServiceImpl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author natal
 */
@ComponentScan(basePackages = "rs.ac.bg.fon.njt3105")
public class AppConfig {

    @Bean(value = "jakarta.persistence.EntityManagerFactory")
    public EntityManagerFactory getEmf() {
        return Persistence.createEntityManagerFactory("rs.ac.bg.fon_njt3105_jar_1.0-SNAPSHOTPU");
    }

    @Bean(value = "org.hibernate.SessionFactory")
    public SessionFactory getSf() {
        return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    @Bean(value="JpaBookService")
    public BookService getJpaBookService(
            @Qualifier("jpa-repository") BookRepository repo,
            Converter<BookDto, Book> converter) {
        return new BookServiceImpl(repo, converter);
    }
    @Bean(value="HibernateBookService")
    public BookService getHibernateBookService(
            @Qualifier("hibernate-repository") BookRepository repo,
            Converter<BookDto, Book> converter) {
        return new BookServiceImpl(repo, converter);
    }

}
