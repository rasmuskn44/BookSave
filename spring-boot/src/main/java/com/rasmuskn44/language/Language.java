package com.rasmuskn44.language;

import jakarta.persistence.*;

@Entity
@Table(name = "language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String language;

    public Long getId() {
        return id;
    }

    public String getLanguage() {
        return language;
    }
}
