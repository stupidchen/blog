package com.stupidchen.blog.model;

/**
 * Created by mike on 12/15/17.
 */
public class Archive {
    private String title;

    private String content;

    private String author;

    private String pubTime;

    private String editTime;

    private Comment[] comments;

    public String getTitle() {
        return title;
    }

    public Archive setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Archive setContent(String content) {
        this.content = content;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Archive setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPubTime() {
        return pubTime;
    }

    public Archive setPubTime(String pubTime) {
        this.pubTime = pubTime;
        return this;
    }

    public String getEditTime() {
        return editTime;
    }

    public Archive setEditTime(String editTime) {
        this.editTime = editTime;
        return this;
    }

    public Comment[] getComments() {
        return comments;
    }

    public Archive setComments(Comment[] comments) {
        this.comments = comments;
        return this;
    }
}
