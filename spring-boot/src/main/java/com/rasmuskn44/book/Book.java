package com.rasmuskn44.book;

import com.rasmuskn44.author.Author;
import com.rasmuskn44.language.Language;
import com.rasmuskn44.tag.Tag;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.Set;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Language language;

    @ColumnDefault("0")
    private int pages;

    @ManyToMany
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"),
            uniqueConstraints = @UniqueConstraint(
                    columnNames = {"book_id", "author_id"}
            )
    )
    private Set<Author> authors;

    @ManyToMany
    @JoinTable(
            name = "book_tag",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"),
            uniqueConstraints = @UniqueConstraint(
                    columnNames = {"book_id", "tag_id"}
            )
    )
    private Set<Tag> tags;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Language getLanguage() {
        return language;
    }

    public int getPages() {
        return pages;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public Set<Tag> getTags() {
        return tags;
    }
}
