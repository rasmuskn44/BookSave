package com.rasmuskn44.read;

import com.rasmuskn44.book.Book;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.hibernate.annotations.ColumnDefault;

import java.sql.Timestamp;
@Entity
@Table(name = "read")
public class read {
    @Id
    @OneToOne
    @JoinColumn(name="book_id", nullable = false)
    private Book book;

    @ColumnDefault("Current_Timestamp")
    @Column(nullable = false)
    private Timestamp startDate;

    @Column
    private Timestamp endDate;

    @Column
    private boolean finished;

    @Min(0)
    @Max(10)
    @ColumnDefault("0")
    private int rating;
}
