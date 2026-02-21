package com.rasmuskn44.library;

import com.rasmuskn44.book.Book;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.sql.Timestamp;

@Entity
@Table(name = "library")
public class library {

    @Id
    @OneToOne
    @JoinColumn(name="book_id", nullable = false)
    private Book book;

    @ColumnDefault("Current_Timestamp")
    private Timestamp creationDate;

}
