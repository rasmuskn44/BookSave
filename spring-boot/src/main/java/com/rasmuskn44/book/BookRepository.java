package com.rasmuskn44.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("""
       SELECT DISTINCT b
       FROM Book b
       LEFT JOIN FETCH b.authors
       LEFT JOIN FETCH b.tags
       WHERE b.id = :id
       """)
    Optional<Book> findByIdWithAuthorsAndTags(Long id);
}
