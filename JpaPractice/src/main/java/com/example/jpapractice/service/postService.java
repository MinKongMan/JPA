package com.example.jpapractice.service;

import com.example.jpapractice.domain.Posts;
import com.example.jpapractice.domain.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.jpapractice.web.dto.postSave;
import com.example.jpapractice.web.dto.postSelect;

@RequiredArgsConstructor
@Service
public class postService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(postSave post){
        Posts p = post.toEntity();
        return postsRepository.save(p).getId();
    }

    public postSelect select(Long id){
        Posts p = postsRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 게시글이 없습니다 ."+id)
        );

        return new postSelect(p);
    }

}
