/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt3105.converter.impl;

import org.springframework.stereotype.Component;
import rs.ac.bg.fon.njt3105.converter.Converter;
import rs.ac.bg.fon.njt3105.domain.Book;
import rs.ac.bg.fon.njt3105.dto.BookDto;

/**
 *
 * @author natal
 */
@Component
public class BookConverter implements Converter<BookDto, Book> {

    @Override
    public Book toEntity(BookDto dto) {
        return new Book(
                dto.getId(),
                dto.getName(),
                dto.getTimeOfRelease(),
                dto.getQuantity(),
                dto.getPublisher(),
                dto.getAuthor());
    }

    @Override
    public BookDto toDto(Book entity) {
        return new BookDto(
                entity.getId(),
                entity.getName(),
                entity.getTimeOfRelease(),
                entity.getQuantity(),
                entity.getPublisher(),
                entity.getAuthor()
        );
    }

}
