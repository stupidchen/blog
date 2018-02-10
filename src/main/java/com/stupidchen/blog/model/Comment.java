package com.stupidchen.blog.model;

/**
 * Created by mike on 2/10/18.
 */
public class Comment {
    private String author;

    private String pubTime;

    private String context;

    public String getAuthor() {
        return author;
    }

    public Comment setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPubTime() {
        return pubTime;
    }

    public Comment setPubTime(String pubTime) {
        this.pubTime = pubTime;
        return this;
    }

    public String getContext() {
        return context;
    }

    public Comment setContext(String context) {
        this.context = context;
        return this;
    }
}
