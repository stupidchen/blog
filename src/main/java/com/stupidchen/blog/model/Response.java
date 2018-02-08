package com.stupidchen.blog.model;

/**
 * Created by mike on 12/15/17.
 */
public class Response {
    private int status;

    private String content;

    public int getStatus() {
        return status;
    }

    public Response setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Response setContent(String content) {
        this.content = content;
        return this;
    }
}
