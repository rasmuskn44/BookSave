package com.rasmuskn44.booklist;

import com.rasmuskn44.book.Book;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.sql.Timestamp;

@Entity
@Table(name = "library")
public class Library extends Booklist {
    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "book_id")
    private Book book;


    @ColumnDefault("Current_Timestamp")
    private Timestamp creationDate;

    @Override
    public Book getBook() {
        return book;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }
}
