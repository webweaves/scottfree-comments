package com.scottfree.scottfreecomments;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Long> {
    Comment findById(long id);
    List<Comment> findByCommentContains(String contains);
}