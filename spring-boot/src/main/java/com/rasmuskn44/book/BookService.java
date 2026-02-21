package com.rasmuskn44.book;

import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    protected Optional<BookResponse> getBook(long id){
        Optional<Book> book = bookRepository.findByIdWithAuthorsAndTags(id);
        return book.map(BookResponse::new);
    }
}
