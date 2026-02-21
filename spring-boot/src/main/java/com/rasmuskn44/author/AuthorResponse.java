package com.rasmuskn44.author;

public record AuthorResponse(Long id, String name) {
    public  AuthorResponse(Author author){this(author.getId(), author.getName());}
}
