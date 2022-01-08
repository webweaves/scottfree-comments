package com.scottfree.dataaccess;

import com.scottfree.scottfreecomments.Comment;
import com.scottfree.scottfreecomments.CommentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class CommentRepositoryTests {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CommentRepository comments;

    @Test
    public void testFindByLastName() {
        Comment comment = new Comment("This is a test comment");
        entityManager.persist(comment);
        List<Comment> findByLastName = comments.findByCommentContains("test comment");
        assertThat(findByLastName).extracting(Comment::getComment).containsOnly(comment.getComment());
    }
}