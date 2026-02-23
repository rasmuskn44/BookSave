package com.rasmuskn44.booklist;

import com.rasmuskn44.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface LibraryRepository extends JpaRepository<Library, Long> { }
