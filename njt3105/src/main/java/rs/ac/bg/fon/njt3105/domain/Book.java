/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt3105.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 *
 * @author natal
 */
@Entity
@Table(name = "knjiga")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "naziv")
    private String name;
    @Column(name = "datum_izdavanja")
    private LocalDate timeOfRelease;
    @Column(name = "tiraz")
    private Long quantity;
    @ManyToOne
    @JoinColumn(name = "izdavac")
    private Publisher publisher;
    @ManyToOne
    @JoinColumn(name = "autor")
    private Author author;

    public Book() {
    }

    public Book(Long id, String name, LocalDate timeOfRelease, Long quantity, Publisher publisher, Author author) {
        this.id = id;
        this.name = name;
        this.timeOfRelease = timeOfRelease;
        this.quantity = quantity;
        this.publisher = publisher;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getTimeOfRelease() {
        return timeOfRelease;
    }

    public void setTimeOfRelease(LocalDate timeOfRelease) {
        this.timeOfRelease = timeOfRelease;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book " + "id=" + id + ", name=" + name + ", timeOfRelease=" + timeOfRelease + ", quantity=" + quantity + ", publisher=" + publisher + ", author=" + author;
    }
    
    
}
