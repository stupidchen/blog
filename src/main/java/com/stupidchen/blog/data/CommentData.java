package com.stupidchen.blog.data;

/**
 * Created by mike on 2/10/18.
 */
public class CommentData {
    private String author;

    private String pubTime;

    private String context;

    public String getAuthor() {
        return author;
    }

    public CommentData setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPubTime() {
        return pubTime;
    }

    public CommentData setPubTime(String pubTime) {
        this.pubTime = pubTime;
        return this;
    }

    public String getContext() {
        return context;
    }

    public CommentData setContext(String context) {
        this.context = context;
        return this;
    }
}
