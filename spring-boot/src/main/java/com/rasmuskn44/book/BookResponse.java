package com.rasmuskn44.book;

import com.rasmuskn44.author.AuthorResponse;
import com.rasmuskn44.language.LanguageResponse;
import com.rasmuskn44.tag.TagResponse;

import java.util.Set;
import java.util.stream.Collectors;

public record BookResponse(long id, String title, int pages, LanguageResponse language, Set<AuthorResponse> authors, Set<TagResponse> tags) {
    public BookResponse(Book book){
        this(   book.getId(),
                book.getTitle(),
                book.getPages(),
                new LanguageResponse(book.getLanguage()),
                book.getAuthors().stream().map(AuthorResponse::new).collect(Collectors.toSet()),
                book.getTags().stream().map(TagResponse::new).collect(Collectors.toSet()));
    }
}
