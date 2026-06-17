/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt3105.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import rs.ac.bg.fon.njt3105.converter.Converter;
import rs.ac.bg.fon.njt3105.domain.Book;
import rs.ac.bg.fon.njt3105.dto.BookDto;
import rs.ac.bg.fon.njt3105.repository.BookRepository;
import rs.ac.bg.fon.njt3105.service.BookDoesNotExistException;
import rs.ac.bg.fon.njt3105.service.BookExistException;
import rs.ac.bg.fon.njt3105.service.BookService;

/**
 *
 * @author natal
 */
public class BookServiceImpl implements BookService {

    private final BookRepository repo;
    private final Converter<BookDto,Book> converter;

    @Autowired
    public BookServiceImpl(BookRepository repo, Converter converter) {
        this.repo = repo;
        this.converter = converter;
    }
    
    @Override
    public BookDto save(BookDto b) throws BookExistException {
        Book entity = (Book) converter.toEntity(b);
        return (BookDto) converter.toDto(repo.save(entity));
    }

    @Override
    public void delete(BookDto b) throws BookDoesNotExistException {
        repo.delete((Book) converter.toEntity(b));
    }
    
}
