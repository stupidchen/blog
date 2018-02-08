package com.stupidchen.blog.model;

/**
 * Created by mike on 12/15/17.
 */
public class Archive {
    private String title;

    private String content;

    private String[] comments;

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

    public String[] getComments() {
        return comments;
    }

    public Archive setComments(String[] comments) {
        this.comments = comments;
        return this;
    }
}
