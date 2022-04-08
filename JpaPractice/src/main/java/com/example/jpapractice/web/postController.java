package com.example.jpapractice.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.jpapractice.service.postService;
import com.example.jpapractice.web.dto.postSave;
import com.example.jpapractice.web.dto.postSelect;

@RestController
@RequiredArgsConstructor
public class postController {
    private final postService postService;

    @PostMapping("/api/v1/posts")
    public Long post(@RequestBody postSave postSave){
        return postService.save(postSave);
    }

    @GetMapping("/api/v1/get/{id}")
    public postSelect get(@PathVariable Long id){
        return postService.select(id);
    }

    @PutMapping("/api/v1/put/{id}")
    public Long update(@PathVariable Long id, @RequestBody postSave ps){
        return postService.update(id, ps);
    }
}
