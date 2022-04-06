package com.example.jpapractice.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String author;

    @Column
    private String content;

    @Column
    private String title;

    @Builder
    public Posts(String author, String content, String title){
        this.author = author;
        this.content = content;
        this.title = title;
    }

    public void update(String content, String title){
        this.content = content;
        this.title = title;
    }
}
