package com.example.jpapractice.web.dto;

import com.example.jpapractice.domain.Posts;
import lombok.Getter;

@Getter
public class postSelect {
    private String title;
    private String content;
    private String author;

    public postSelect(Posts p){
        title = p.getTitle();
        content = p.getContent();
        author = p.getAuthor();
    }

}
