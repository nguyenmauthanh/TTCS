package org.thanhnm.blogapp.service;

import org.thanhnm.blogapp.model.Comment;

public interface CommentService {

    Comment save(Comment comment);

    void delete(Comment comment);

}
