package com.rasmuskn44.tag;

import jakarta.persistence.*;

@Entity
@Table(name = "tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String tag;

    public Long getId() {
        return id;
    }

    public String getTag() {
        return tag;
    }
}
