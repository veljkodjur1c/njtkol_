/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt3105.dto;

import java.io.Serializable;
import java.time.LocalDate;
import rs.ac.bg.fon.njt3105.domain.Author;
import rs.ac.bg.fon.njt3105.domain.Publisher;

/**
 *
 * @author natal
 */
public class BookDto implements Serializable{
    
    private Long id;
    
    private String name;
    
    private LocalDate timeOfRelease;
    
    private Long quantity;
   
    private Publisher publisher;
   
    private Author author;

    public BookDto() {
    }

    public BookDto(Long id, String name, LocalDate timeOfRelease, Long quantity, Publisher publisher, Author author) {
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
        return "BookDto{" + "id=" + id + ", name=" + name + ", timeOfRelease=" + timeOfRelease + ", quantity=" + quantity + ", publisher=" + publisher + ", author=" + author + '}';
    }
    
}
