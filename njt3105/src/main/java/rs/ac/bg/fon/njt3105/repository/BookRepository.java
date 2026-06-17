/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rs.ac.bg.fon.njt3105.repository;

import rs.ac.bg.fon.njt3105.domain.Book;

/**
 *
 * @author natal
 */
public interface BookRepository {
    Book save(Book b);
    void delete(Book b);
}
