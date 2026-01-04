package com.harsh.blog.services;

import com.harsh.blog.domain.CreatePostRequest;
import com.harsh.blog.domain.UpdatePostRequest;
import com.harsh.blog.domain.entities.Post;
import com.harsh.blog.domain.entities.User;
import org.mapstruct.control.MappingControl;

import java.util.List;
import java.util.UUID;

public interface PostService {
    Post getPost(UUID id);

    List<Post> getAllPost(UUID categoryId, UUID tagId);

    List<Post> getDraftPost(User user);

    Post createPost(User user, CreatePostRequest createPostRequest);

    Post updatePost(UUID id, UpdatePostRequest updatePostRequest);

    void deletePost(UUID id);
}
