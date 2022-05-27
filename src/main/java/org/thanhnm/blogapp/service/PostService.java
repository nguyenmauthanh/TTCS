package org.thanhnm.blogapp.service;

import org.thanhnm.blogapp.model.Post;

import java.util.Collection;
import java.util.Optional;

public interface PostService {

    Optional<Post> getById(Long id);

    Collection<Post> getAll();

    Post save(Post post);

    void delete(Post post);
}

