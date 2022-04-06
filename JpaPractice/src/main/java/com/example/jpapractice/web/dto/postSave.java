package com.example.jpapractice.web.dto;

import com.example.jpapractice.domain.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class postSave {
    private String title;
    private String content;
    private String author;

    @Builder
    public postSave(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity(){
        return Posts.builder()
                .content(content)
                .title(title)
                .author(author)
                .build();
    }


}
