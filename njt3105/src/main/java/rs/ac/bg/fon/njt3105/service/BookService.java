/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rs.ac.bg.fon.njt3105.service;

import rs.ac.bg.fon.njt3105.dto.BookDto;

/**
 *
 * @author natal
 */
public interface BookService {
    BookDto save(BookDto b) throws BookExistException;
    void delete(BookDto b) throws BookDoesNotExistException;
}
