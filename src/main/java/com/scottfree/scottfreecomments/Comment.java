package com.scottfree.scottfreecomments;


import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name="comments")
public class Comment {
    @Id
    @Column(name = "commentId", nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "articleId")
    private Long articleId;

    @Lob
    @Column(name = "comment")
    private String comment;

    @Column(name = "dateAdded")
    private Instant dateAdded;

    @Column(name = "approved")
    private Integer approved;

    @Column(name = "deleted")
    private Integer deleted;

    @Column(name = "likes")
    private Integer likes;

    protected Comment() {

    }

    public Comment(String comment) {
        this.comment = comment;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getApproved() {
        return approved;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public Instant getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Instant dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}