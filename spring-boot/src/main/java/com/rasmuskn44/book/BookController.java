package com.rasmuskn44.book;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public BookResponse getMovie(@Valid @PathVariable long id) {
        Optional<BookResponse> bookResponse = bookService.getBook(id);
        if (bookResponse.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book with id " + id + " not found!");
        }
        return bookResponse.get();
    }
}
