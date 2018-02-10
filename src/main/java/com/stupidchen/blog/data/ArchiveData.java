package com.stupidchen.blog.data;

import com.stupidchen.blog.model.Comment;

/**
 * Created by mike on 2/10/18.
 */
public class ArchiveData {
    private String id;

    private String title;

    private String context;

    private String author;

    private String pubTime;

    private String editTime;

    private Comment[] comments;

    public String getId() {
        return id;
    }

    public ArchiveData setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ArchiveData setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContext() {
        return context;
    }

    public ArchiveData setContext(String context) {
        this.context = context;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public ArchiveData setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPubTime() {
        return pubTime;
    }

    public ArchiveData setPubTime(String pubTime) {
        this.pubTime = pubTime;
        return this;
    }

    public String getEditTime() {
        return editTime;
    }

    public ArchiveData setEditTime(String editTime) {
        this.editTime = editTime;
        return this;
    }

    public Comment[] getComments() {
        return comments;
    }

    public ArchiveData setComments(Comment[] comments) {
        this.comments = comments;
        return this;
    }
}
