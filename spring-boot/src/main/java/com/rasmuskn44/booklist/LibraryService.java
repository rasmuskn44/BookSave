package com.rasmuskn44.booklist;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class LibraryService {
    private LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository){
        this.libraryRepository = libraryRepository;
    }

    @Transactional
    protected Set<BooklistResponse> getLibrary(){
        return libraryRepository.findAll().stream().map(BooklistResponse::new).collect(Collectors.toSet());
    }
}
